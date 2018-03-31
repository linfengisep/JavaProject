public class StringSplit{
   public static void main(String[]args){
      String test = "What is blue + yellow?/green";
      String[]result = test.split("/");
      for(String token:result){
         System.out.println(token);
      }
   }
}
