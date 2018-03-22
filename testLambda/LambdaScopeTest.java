import java.util.function.Consumer;

public class LambdaScopeTest{
   public int x = 0;

   class InnerScope {
      public int x = 1;
      void showInnerScopeVara(int x){
         Consumer<Integer> myComsumer =(y)->{
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            System.out.println("this.x = "+this.x);
            System.out.println("LambdaScopeTest.this.x = "+LambdaScopeTest.this.x);
         };
         myComsumer.accept(x);
      }
   }

   public static void main(String[]args){
      LambdaScopeTest lst = new LambdaScopeTest();
      LambdaScopeTest.InnerScope innerLst = lst.new InnerScope();
      innerLst.showInnerScopeVara(2);
   }
}
