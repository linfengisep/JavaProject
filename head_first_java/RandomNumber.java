import java.util.*;
public class RandomNumber{
   public static int ramdInt(int min,int max){
      Random randomGenerator = new Random();
      int randomNumber = randomGenerator.nextInt((max-min)+1)+min;
      return randomNumber;
   }

   public static void main(String[]args){
      /*Random ran = new Random();
      int x = ran.nextInt(10) + 1;*/
      int x = ramdInt(1,10);
      System.out.println("random number is:"+x);

   }
}
