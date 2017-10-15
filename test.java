//1.creating a thread
/**
public class test implements Runnable {
         public void run(){
          System.out.println("Hello from a thread.");
         }
         public static void main(String [] args){
         (new Thread(new test())).start();
         }
}
**/
//2.Pausing executions with sleep
/**
public class test{
   public static void main(String arg[])throws InterruptedException{
      String importantInfo[]={
         "je suis étudiant d'ISEP",
         "Tout le monde est chaud pour informatique",
         "Nous sommes élites dans cette société."
      };
      for (int i=0;i<importantInfo.length;i++){
         Thread.sleep(4000);
         System.out.println(importantInfo[i]);
      }
   }
}
**/

public class test{
   public static void main(String arg[])throws InterruptedException{
      String sn="String_name";
      String s=new String(sn);
      System.out.println(s);
   }
}
