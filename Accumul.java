import java.lang.StringBuffer;

public class Accumul{
   public static String accum(String s) {
      char[] charArr = s.toCharArray();
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<charArr.length;i++){
         String string = new String();
         string = Character.toString(charArr[i]).toUpperCase();
         for(int j=0;j<i;j++){
            string+=Character.toString(charArr[i]).toLowerCase();
         }
         string+="-";
         sb.append(string);
      }
      return sb.toString().substring(0,sb.toString().length()-1);
   }
   public static void main(String[] args) {
      System.out.println(accum("RqaEzty"));
   }
}
