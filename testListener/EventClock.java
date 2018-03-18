public class EventClock extends MyAlarm{
   public int stopClock=2000;
   public int currentClock=0;
   public MyAlarm myAlarm;

   public  void timeRuning(){
         while(currentClock !=stopClock){
               currentClock++;
               System.out.println("now is: "+currentClock);
            if(currentClock%6 == 0){
               System.out.println("Your alarm just remind you here.");
               myAlarm.setOnEventListener(new OnEventListener(){
                  @Override
                  public void onEvent(){
                        System.out.println("Sharp O'click");
                  }
               });
            }
         }
      }

   public static void main(String[]args){
      EventClock myLittleClock = new EventClock();
      myLittleClock.timeRuning();
   }
}
