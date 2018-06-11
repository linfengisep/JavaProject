public class TestModule{

   public static int sub=2;

   public static void makeItModule(int value){
      while(value !=0){
         value =value / sub;
         System.out.println(value);
      }
   }
   public static void main(String[]args){
      int number = 10;
      makeItModule(number);
   }
}
