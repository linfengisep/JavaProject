import java.util.*;

public class MaxOccurenceLetter{
   public static int getNumberOccurence(String s,char c, int index){
      if(index >= s.length()) return 0;
      int count = s.charAt(index) == c ? 1 : 0;
      return count + getNumberOccurence(s,c,index+1);
   }

   public static void main(String[] args) {
      String s = "aqdfeqdddszddfffcdcdcdcsqedf";
      char[] chars = s.toUpperCase().toCharArray();
      Arrays.sort(chars);
      int max = 0,index=0;
      for(int i=0;i<chars.length;i++){
         int temp = getNumberOccurence(s.toUpperCase(),chars[index++],0);
         if(max < temp) max = temp;
      }
      System.out.println(max);
   }
}
/*
//solution one:
   public static int getMaxOccurenceLetter(String s){
      char[] letters = s.toUpperCase().toCharArray();
      Arrays.sort(letters);
      int max= 0;
      for(int i=1;i<letters.length;i++){
         int temp = 0;
         temp=getLetterOccurence(letters,letters[i]);
         if(max<temp) max = temp;
      }
      return max;
   }

   public static int getLetterOccurence(char[] chars,char c){
      int num = 0;
      for(int i=0;i<chars.length;i++){
         if(chars[i]==c){
            num++;
         }
      }
      return num;
   }
   public static void main(String [] args){
      System.out.println(getMaxOccurenceLetter("aqdfeqdddszddfffcdcdcdcsqedf"));
   }
*/
