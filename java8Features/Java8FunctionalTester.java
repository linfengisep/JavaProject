import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Java8FunctionalTester{
   public static void main(String args[]) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
         System.out.println("Print numbers greater than 5:");
         eval(list, n-> n > 5 );

         System.out.println("Print numbers divised totally by 3:");
         eval(list, n-> n % 3==0 );
      }

      public static void eval(List<Integer> list, Predicate<Integer> predicate) {
         for(Integer n: list) {
            if(predicate.test(n)) {
               System.out.println("Satisfied:"+n);
            }
         }
   }
}
