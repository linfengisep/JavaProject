public class TestThread implements Runnable{
   public void run(){
      doJob();
   }
   public void doJob(){
      System.out.println("i am at the thread.");
   }

   public static void main(String[]args){
      TestThread job = new TestThread();
      Thread worker = new Thread(job);
      worker.start();
      System.out.println("i am at main thread.");
   }
}
