import java.util.Collection;

public final class Algo{
   public static <T> int countNum(Collection<T> c, NumTest<T> numTest){
      int total =0;
      for(T t:c){
         if(numTest.test(t)) total++;
      }
      return total;
   }
}
