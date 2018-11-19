public class Java8LambdaTester{
   //define an operation interface;
   interface Operation{
      int operate(int first, int second);
   }
   private int doOperation(int m,int n,Operation operation){
      return operation.operate(m,n);
   }

   public static void main(String[] args) {
      Java8LambdaTester tester = new Java8LambdaTester();
      Operation addition = (int a,int b)->a+b;//write the implementation body directly.
      Operation subtraction = (a,b)-> a-b;// without type declaration
      Operation multiplication = (a,b)-> a*b;
      Operation division = (a,b)-> {return a/b;}; //with return keyword, make it a statement which means ; and {}
      //
      System.out.println(tester.doOperation(2,3,addition));
      System.out.println(tester.doOperation(4,3,subtraction));
      System.out.println(tester.doOperation(4,3,multiplication));
      System.out.println(tester.doOperation(4,2,division));
   }
}
