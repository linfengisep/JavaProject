import java.util.Random;

public class MessageWriter implements Runnable{
   private static final String KEY_ARR_EMPTY = "ARRAY_EMPTY";
   private static final int PERIOD_TIME = 3000;

   private MessageChanel messageChanel;
   public MessageWriter(MessageChanel chanel){
      this.messageChanel = chanel;
   }

   public void run(){
      String arrCapitals[] = {"Rome","Paris","Pékin","New-York",
            "Madrid","Londons","Tokyo","Séoul"};
      //ramdom number generator;
      Random random = new Random();
      for (int i=0;i<arrCapitals.length;i++) {
      if(messageChanel !=null){
         messageChanel.writeMessage(arrCapitals[i]);
      }
      try{
         Thread.sleep(random.nextInt(PERIOD_TIME));
         }catch(InterruptedException e){}
         System.out.format("writing message:%s %n",arrCapitals[i]);
      }
      if(messageChanel !=null){
         messageChanel.writeMessage(KEY_ARR_EMPTY);
      }
   }
/*
   //test this class; this class works fine;
   public static void main(String[] args) {
      (new Thread(new MessageWriter())).start();
   }
*/
}
