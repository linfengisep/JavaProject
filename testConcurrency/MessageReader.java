import java.util.Random;

public class MessageReader implements Runnable{
      private static final String KEY_ARR_EMPTY = "ARRAY_EMPTY";
      private static final int PERIOD_TIME = 3000;
      private MessageChanel messageChanel;

      public MessageReader(MessageChanel chanel){
      this.messageChanel = chanel;
   }
      public void run(){
      Random random = new Random();
      for(String message = messageChanel.readMessage();
         !message.equals(KEY_ARR_EMPTY);
         message = messageChanel.readMessage()){
            System.out.format("Message reçu: %s %n",message);
         try{
            Thread.sleep(random.nextInt(PERIOD_TIME));
            //printLine(20);
         }catch(InterruptedException e){}
      }
      System.out.format("Transportation finished:%s",KEY_ARR_EMPTY);
   }
/*
   //test this class;
   public void printLine(int numberOfLine){
      for (int i=0;i<numberOfLine ;i++) {
         System.out.print("*");
      }
         System.out.println(" ");
   }

   public static void main(String[] args) {
      MessageChanel chanel = new MessageChanel("testMessage");
      (new Thread(new MessageReader(chanel))).start();
   }
*/
}
