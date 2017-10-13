public class ThreadSleep{
   public static void main(String args[]) throws InterruptedException {
      String InfoArray[]={"Liberté","Fraternité","L'égalité"};

      for(String s:InfoArray){
      System.out.println("Le devis est: "+s+".");
      //pause for 1.5 seconds;
      Thread.sleep(1500);
      }
      System.out.println("tout est terminé.");
   }
}
