/*
1.happen-before is more reliable than the timeDuration;
2.using join() make sure the executing order;
*/
public class ExerciseThread{
   static String texto;
   static String messageOne = "i am hungry";
   static String messageTwo = "i am not hungry";
   static class MessageWriter extends Thread{
      public void run(){
         try{
            Thread.sleep(500);
         }catch(InterruptedException e){}
         texto = messageOne;
      }
   }
   public static void separator(){
      System.out.println("**************************");
   }
   public static void main(String[] args) throws InterruptedException {
         //even though the joining thread last longer than the main thread who is sleeping
         (new MessageWriter()).start();
         (new MessageWriter()).join();
         texto = messageTwo;
         Thread.sleep(1000);
         System.out.println(texto);
         separator();
   }
}
