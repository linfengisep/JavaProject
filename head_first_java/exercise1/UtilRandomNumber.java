import java.util.Random;
public class UtilRandomNumber{
   public static int ramdInt(int min,int max){
      Random randomGenerator = new Random();
      int randomNumber = randomGenerator.nextInt((max-min)+1)+min;
      return randomNumber;
   }
}
