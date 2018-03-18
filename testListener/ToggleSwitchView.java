public class ToggleSwitchView {
   private OnClickListener leftButtonClickListener;// a instance of interface???
   private OnClickListener rightButtonClickListener;

   public ToggleSwitchView(Context context) {
     this(context, null);
   }

   public interface OnClickListener {
     void onClick();
   }
   //class member method, with argument of interface;
   public void setOnLeftButtonClickListener(OnClickListener listener) {
     this.leftButtonClickListener = listener;
   }

   public void setOnRightButtonClickListener(OnClickListener listener) {
     this.rightButtonClickListener = listener;
   }
   // a new class where
   private class LeftButtonClickCallback implements View.OnClickListener {

     @Override public void onClick(View v) {
       if (leftButtonClickListener != null) {
         leftButtonClickListener.onClick();
       }
     }
   }

   private class RightButtonClickCallback implements View.OnClickListener {

     @Override public void onClick(View v) {
       if (rightButtonClickListener != null) {
         rightButtonClickListener.onClick();
       }
     }
   }
}
