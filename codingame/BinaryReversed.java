public class BinaryReversed{

   public static int binaryOpe(int value){
      int result = 0;
      while(value !=0){
         result <<=1;
         result = result|(value &1);
         value >>=1;
      }
      return result;
   }
   public static void main(String[]args){
      int a = 60; /* 60 = 0011 1100 */
      int b = 13; /* 13 = 0000 1101 */
      int c = 0;
      c = a | b ; /*c = 0011 1101 61*/
      System.out.println(c);

      c = a & b; /*c = 0000 1100 12*/
      System.out.println(c);

      c = a ^ b; /*c = 0011 0001  49 */
      System.out.println(c);

      c = ~ a; /*c = 1100 0011  */
      System.out.println(c);

      c = a>>2 ; /*c = 0000 1111  15*/
      System.out.println(c);

      c = Integer.reverseBytes(a) ; /*c = 0000 1111  15*/
      System.out.println(c);

      System.out.println(binaryOpe(a));

      System.out.println("1%2:"+1%2+",0%2:"+0%2);
   }
}
