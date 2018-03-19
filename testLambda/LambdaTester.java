/*
*optional type declaration:no need to declare the type of a parameter.
*optional parenthesis around parameter:no need to declare a single parameter in parenthesis,but for multiple parameters,parenthesis are required
*optional curly braces:no need to use curly braces in expression body if the body contains a single statement
*optional return keyword:value will be automatically returned if the body has a single expression.Curly braces are required to indicate that expression return a value
*/

public class LambdaTester{
   public static void main(String[]args){
      LambdaTester tester = new LambdaTester();
      MathOperation addition = (int a,int b)->a+b;
      MathOperation subtraction = (a,b)->a-b;
      MathOperation multiplication = (int a,int b)->{return a*b; };
      MathOperation division = (int a,int b)-> a/b;

      System.out.println("10 + 5 = "+tester.operate(10,5,addition));
      System.out.println("10 - 5 = "+tester.operate(10,5,subtraction));
      System.out.println("10 * 5 = "+tester.operate(10,5,multiplication));
      System.out.println("10 / 5 = "+tester.operate(10,5,division));
   }
   interface MathOperation{
      int operation(int a,int b);
   }
   private int operate(int a,int b,MathOperation mathOperation){
   return mathOperation.operation(a,b);
   }
}
