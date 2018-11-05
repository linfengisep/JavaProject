import TestSuper.java;

public class TestModule extends TestSuper{

   public int sub=2;

   public void makeItModule(int value){
      while(value !=0){
         value =value / sub;
         System.out.println(value);
      }
   }
   public static void main(String[]args){
      TestModule test = new TestModule();
      test.superMethod();
   }

   @override public int superMethod(){
      System.out.println("method implemented from super class");
   }
}
