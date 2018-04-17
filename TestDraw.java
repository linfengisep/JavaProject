public class TestDraw{
   private void drawButtons(Canvas c, RecyclerView.ViewHolder viewHolder) {
          float corners = 16;

          View itemView = viewHolder.itemView;
          Paint p = new Paint();
         //this is the size of the button area; and it is a Rectangle;
          RectF rightButton = new RectF(itemView.getRight() - buttonWidth, itemView.getTop(), itemView.getRight(), itemView.getBottom());
          p.setColor(Color.RED);
          c.drawRoundRect(rightButton, corners, corners, p);
          drawText("DELETE", c, rightButton, p);
          drawCross(c);
      }

      private void drawText(String text, Canvas c, RectF button, Paint p) {
          float textSize = 60;
          p.setColor(Color.WHITE);
          p.setAntiAlias(true);
          p.setTextSize(textSize);

          float textWidth = p.measureText(text);
          c.drawText(text, button.centerX()-(textWidth/2), button.centerY()-100, p);
      }

      private void drawCross(Canvas canvas){
         Paint crossPaint = new Paint();
         //define the color of the line;
         crossPaint.setColor(Color.WHITE);
         //define the start point and stop point of the line;
        //float width = button.width();
        //float height = button.height();
         //the cross rectangle  left,top,right,bottom; width = height = 60;
         //RectF crossRectangle = new RectF(button.centerX - 30,button.centerY + 60+20,button.centerX + 30,button.centerY +20);
         //canvas.drawRect(crossRectangle,crossPaint);
         canvas.drawLine(button.centerX -30,button.centerY + 20,button.centerX+30,button.centerY + 20+60);
         canvas.drawLine(button.centerX -30,button.centerY + 20+60,button.centerX+30,button.centerY + 20);
      }
}
