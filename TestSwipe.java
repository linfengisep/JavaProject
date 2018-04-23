package com.appie.spot.live;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.appie.spot.R;

import static android.support.v7.widget.helper.ItemTouchHelper.ACTION_STATE_SWIPE;
import static android.support.v7.widget.helper.ItemTouchHelper.LEFT;

enum ButtonState {
  GONE,
  RIGHT_VISIBLE
}

public class TestSwpie extends Callback {
  private final static float BUTTON_WIDTH = 300;
  private boolean swipeBack = false;
  private ChatActivitySwipeAction TestSwpie;
  private ButtonState buttonState = ButtonState.GONE;
  private RectF buttonInstance = null;  // holds four float coordinates for a rectangle
  private RecyclerView.ViewHolder currentItemViewHolder = null;
  private Context context;

  ChatActivitySwipeController(
      ChatActivitySwipeAction TestSwpie, Context context) {
    this.TestSwpie = TestSwpie;
    this.context = context;
  }

  @Override
  public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
    return makeMovementFlags(0, LEFT);
  }

  /*
   *when dragging item,ItemTouchHelper will call onMove(recyclerView,oldPosition,newPosition);
   *
   * */
  @Override public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
      RecyclerView.ViewHolder target) {
    return false;
  }

  /*
   * When swiping, ItemTouchHelper animates it until it goes out of bounds, then calls onSwiped();
   * */
  @Override public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
  }

  /*
   * need block swipe somewhere to avoid swipe out the item;
   * */
  @Override public int convertToAbsoluteDirection(int flags, int layoutDirection) {
    if (swipeBack) {
      swipeBack =  buttonState != ButtonState.GONE;
      return 0;
    }
    return super.convertToAbsoluteDirection(flags, layoutDirection);
  }
  /*but where swipeBack come from? need set onTouchListener on RecyclerView
   *->after finishing the swiping
   *set swipeBack true;
   */

  //Called by ItemTouchHelper on RecyclerView's onDraw callback;
  @Override public void onChildDraw(Canvas canvas, RecyclerView recyclerView,
      RecyclerView.ViewHolder viewHolder, float dX, float dY,
      int actionState, boolean isActive) {
    //A View is currently being swiped.
    if (actionState == ACTION_STATE_SWIPE) {
      if (buttonState != ButtonState.GONE) {
        if (buttonState == ButtonState.RIGHT_VISIBLE) {
          //obtain the final release position,compare it with the button width;
          dX = Math.min(dX, -BUTTON_WIDTH);
        }
        //pass the final position info to super;
        super.onChildDraw(canvas, recyclerView, viewHolder, dX, dY, actionState, isActive);
      } else {
        setTouchListener(canvas, recyclerView, viewHolder, dX, dY, actionState, isActive);
      }
    }

    if (buttonState == ButtonState.GONE) {
      super.onChildDraw(canvas, recyclerView, viewHolder, dX, dY, actionState, isActive);
    }
    currentItemViewHolder = viewHolder;
  }

  //in this listener, check how much to the left user swiped the item,
  //if enough, we change the state to show buttons;
  @SuppressLint("ClickableViewAccessibility") private void setTouchListener(Canvas canvas,
      RecyclerView recyclerView,
      RecyclerView.ViewHolder viewHolder, float dX, float dY,
      int actionState, boolean isActive) {
    recyclerView.setOnTouchListener(new View.OnTouchListener() {
      @Override public boolean onTouch(View v, MotionEvent event) {
        //when a pressed gesture finished or aborted, set the swipeBack true;
        swipeBack = event.getAction() == MotionEvent.ACTION_CANCEL
            || event.getAction() == MotionEvent.ACTION_UP;
        if (swipeBack) {
          //at this moment, if the position of finger is bigger than button width;
          if (dX < -BUTTON_WIDTH) {
            buttonState = ButtonState.RIGHT_VISIBLE;
          }
          if (buttonState != ButtonState.GONE) {
            //when the button appear, check the slide movement;
            setTouchDownListener(canvas, recyclerView, viewHolder, dX, dY, actionState, isActive);
            setItemsClickable(recyclerView, false);
          }
        }
        return false;
      }
    });
  }

  //when the button shows,and wait for the delete action;
  @SuppressLint("ClickableViewAccessibility") private void setTouchDownListener(final Canvas c,
      final RecyclerView recyclerView,
      final RecyclerView.ViewHolder viewHolder, final float dX, final float dY,
      final int actionState, final boolean isCurrentlyActive) {
    recyclerView.setOnTouchListener(new View.OnTouchListener() {
      @Override public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
          setTouchUpListener(c, recyclerView, viewHolder, dX, dY, actionState,
              isCurrentlyActive);
          Toast.makeText(context, "click:" + dX + ",dY" + dY,
              Toast.LENGTH_SHORT).show();
        }
        return false;
      }
    });
  }

  @SuppressLint("ClickableViewAccessibility")
  private void setTouchUpListener(final Canvas c, final RecyclerView recyclerView,
      final RecyclerView.ViewHolder viewHolder, final float dX, final float dY,
      final int actionState, final boolean isCurrentlyActive) {
    recyclerView.setOnTouchListener(new View.OnTouchListener() {
      @Override public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
          ChatActivitySwipeController.super.onChildDraw(c, recyclerView, viewHolder, 0F, dY,
              actionState, isCurrentlyActive);

          setItemsClickable(recyclerView, false);
          swipeBack = false;
          //buttonInstance.contains(x,y):Returns true if (x,y) is inside the rectangle.
          if (TestSwpie != null && buttonInstance != null && buttonInstance.contains(
              event.getX(), event.getY())) {
            if (buttonState == ButtonState.RIGHT_VISIBLE) {
              //pass item position info to inform ChatActivity,make it notified data changed;
              chatActivitySwipeAction.onRightClicked(viewHolder.getAdapterPosition());
            }
          }
          buttonState = ButtonState.GONE;
          currentItemViewHolder = null;
        }
        return false;
      }
    });
  }

  public void onDraw(Canvas canvas) {
    if (currentItemViewHolder != null) {
      drawButton(canvas, currentItemViewHolder);
    }
  }

  private void drawButton(Canvas canvas, RecyclerView.ViewHolder viewHolder) {
    float corners = 1;
    View itemView = viewHolder.itemView;
    Paint p = new Paint();
    p.setColor(Color.RED);

    RectF rightButton = new RectF(itemView.getRight() - BUTTON_WIDTH, itemView.getTop(),
        itemView.getRight(), itemView.getBottom());

    canvas.drawRoundRect(rightButton, corners, corners, p);
    drawText(context.getString(R.string.profile_activity_delete), canvas, rightButton,
        p);
    drawCross(canvas, rightButton);
    buttonInstance = rightButton;
  }

  private void drawText(String btnText, Canvas canvas, RectF button, Paint paint) {
    float textSize = 40;
    paint.setColor(Color.WHITE);
    paint.setAntiAlias(true);
    paint.setTextSize(textSize);

    float textWidth = paint.measureText(btnText);
    canvas.drawText(btnText, button.centerX() - (textWidth) / 2, button.centerY() + 60,
        paint);
  }

  private void drawCross(Canvas canvas, RectF button) {
    Paint crossPaint = new Paint();
    crossPaint.setColor(Color.WHITE);
    crossPaint.setStrokeWidth(5);
    canvas.drawLine(button.centerX() - 30, button.centerY(), button.centerX() + 30,
        button.centerY() - 60, crossPaint);
    canvas.drawLine(button.centerX() - 30, button.centerY() - 60, button.centerX() + 30,
        button.centerY(), crossPaint);
  }

  private void setItemsClickable(RecyclerView recyclerView, boolean isClickable) {
    for (int i = 0; i < recyclerView.getChildCount(); ++i) {
      recyclerView.getChildAt(i).setClickable(isClickable);
    }
  }
}
