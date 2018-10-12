public class InstanciateThread extends Thread{
   public void run(){
      System.out.println("inside thread");
   }
   public static void main(String[] args) {
      (new InstanciateThread()).start();
   }
}
