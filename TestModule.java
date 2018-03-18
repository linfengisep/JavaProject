public class TestModule{

   public static int sub=10;

   public static void makeItModule(){
      for(int i=0;i<=20;i++){
      System.out.println(i%sub);
      }
   }
   public static void main(String[]args){
      makeItModule();
   }
}
