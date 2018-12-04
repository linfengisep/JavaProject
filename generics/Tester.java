import java.util.Collection;
import java.util.Arrays;

public class Tester{
   public static void main(String[] args) {
      Collection<Integer> c = Arrays.asList(2,4,5,8,9,10);
      System.out.println(Algo.countNum(c,new NumTestImpl()));
   }
}
