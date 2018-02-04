
public class StaticFactoryMethod{
   public int number=0;
   public boolean truth=true;

   public StaticFactoryMethod(int a){
   this.number=a;
   }

   public static String makeDescription(){
      return "you are calling a string";
   }

   public void printResult(){
      System.out.println("the value of number is:= "+number+","
      +StaticFactoryMethod.makeDescription());
   }

   public static void main(String[]args){
      StaticFactoryMethod sfm = new StaticFactoryMethod(2);
      sfm.printResult();
   }
}
