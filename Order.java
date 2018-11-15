import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
public class Order {
   public static String order(String words){
      String[] strings =words.split(" ");
      List<String> stringList = new ArrayList<>();
      for(String s:strings){stringList.add(s);}
      Collections.sort(stringList,new Comparator<String>(){
         public int compare(String s1, String s2){
            return stringToInt(s1)-stringToInt(s2);
         }
         public int stringToInt(String s){
                 String num = s.replaceAll("\\D", "");
                 return num.isEmpty() ? 0 : Integer.parseInt(num);
         }
      });
      StringBuffer sb = new StringBuffer();
      for(String s:stringList){sb.append(s+" ");}
      return sb.toString().substring(0,sb.length()-1);
   }
   public static void main(String[] args) throws IOException{
      System.out.println(order("Thi3s is2 1a T4est"));
   }
}
