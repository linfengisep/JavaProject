public class TestJava{
   public static String getResult(String check){
      String test;
      switch(check){
         case "ok":
               test="ok";
               break;
         case "yes":
               test="yes";
               break;
         default:
               test= "no";
      }
      return test;
   }
   public static void main(String[] args){
      System.out.println(getResult("ok"));
   }
}
