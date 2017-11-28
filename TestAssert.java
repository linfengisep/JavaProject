import java.util.*;

public class TestAssert{
   public static void main(String[]args){
   boolean notQuit=true;
      while(notQuit){
         Scanner s=new Scanner(System.in);
         System.out.print("Enter your age:(enter 0 to quit.)");
      int value=s.nextInt();
      assert value==18:"Not valid.";
      System.out.println("Value is:"+value);
      if(value==0)
      notQuit=false;
      }
   }
}
