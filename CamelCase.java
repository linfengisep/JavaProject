public class CamelCase{
   static String toCamelCase(String s){
      char[] charArr = s.toCharArray();
      for(int i=0;i<charArr.length;i++){
         if(charArr[i]=='-' || charArr[i]=='_'){
            if(charArr[i+1]>=91){
               char ch = charArr[i+1];
               ch -=32;
               charArr[i+1]=ch;
            }
         }
      }
         return String.valueOf(charArr).replaceAll("-","").replaceAll("_","");

 }
   public static void main(String[] args) {
      System.out.println(toCamelCase("the_Stealth_Warrior"));
      System.out.println(toCamelCase("at-afd-the-stealth-Warrior-is-good"));
   }
}
