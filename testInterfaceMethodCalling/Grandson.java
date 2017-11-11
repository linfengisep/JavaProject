public class Grandson  {

   public static ChildInterface childInterface=null;
   public int testValue=200;
   public ChildExtendsInterface cd = new ChildExtendsInterface();

   public int testMethod(){
      testValue = testValue+100;
      return testValue;
   }

   public static void main(String[]args){
      Grandson gs = new Grandson();
      System.out.println("gs.testMethod()="+gs.testMethod());
      System.out.println("gs.cd.getMessage()="+gs.cd.getMessage());
      System.out.println("gs.cd.getResult()="+gs.cd.getResult());
      System.out.println("gs.cd.getValue()="+gs.cd.getValue());
      System.out.println("*********************************");
   }

}
