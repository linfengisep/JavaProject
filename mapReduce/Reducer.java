import java.util.function.BiFunction;
/*
interface Bifunction<T,U,R>
T:first argument
U:second argument
R:return type
*/
public class Reducer implements BiFunction<Integer,Integer,Integer>{
/*
applies this function to the given two arguments.
addition to reduce word count.
*/
   @Override
   public Integer apply(Integer m,Integer n){
      return m+n;
   }
}
