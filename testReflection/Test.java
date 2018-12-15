import java.lang.reflect.Constructor;

public class Test{
   public static void main(String[] args) throws Exception{
      Constructor<MathOperation> myconstructor =
      MathOperation.class.getConstructor(Integer.TYPE,Integer.TYPE);

      MathOperation mathOperation = myconstructor.newInstance(32,48);
      mathOperation.printSum();
   }
}
