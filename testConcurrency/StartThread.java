public class StartThread implements Runnable {
   public void run(){
      System.out.println("from one thread created");
   }
   public static void main(String[] args) {
      (new Thread(new StartThread())).start();
   }
}
