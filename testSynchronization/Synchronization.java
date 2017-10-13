/**
*Synchronized statements
*
*
*/
import java.util.*;


public class Synchronization {
      protected String lastName=null;
      protected int nameCount=0;
      protected ArrayList<String> nameList= new ArrayList<String>();

      //test the addname method
      public void addName(String name){
      lastName = name;
      nameCount++;
      nameList.add(name);
      }

      public void showContent(){
         for(String s:nameList){
         System.out.println("the last Name is:"+s);
         }
         System.out.println("the total name is:"+nameCount);
         System.out.println("the last name which user entered is:"+lastName);
      }

      public static void main(String args[]){
      Synchronization sc=new Synchronization();

      Synchronization sc1=new Synchronization();
      sc.addName("linfeng");
      sc.addName("James");
      sc.addName("Curry");
      sc.showContent();

      sc1.addName("Kevin");
      sc1.showContent();

   }
}
