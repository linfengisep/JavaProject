public class MyAlarm {
   public OnEventListener myListener;
   //define an interface;
   public interface OnEventListener {
      void onEvent();
   }

   public void setOnEventListener(OnEventListener eventListener){
      this.myListener = eventListener;
   }
}
