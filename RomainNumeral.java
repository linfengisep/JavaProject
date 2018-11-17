/*
Symbol    Value
I          1
V          5

X          10
L          50

C          100
D          500

M          1,000
I,II,III,IV,VI,VII,VIII,IX,X,XI
Modern Roman numerals are written by expressing each digit separately starting with the left most digit
and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC;
resulting in MCMXC. 2008 is written as
2000=MM,
8=VIII,
1666 uses each Roman symbol in descending order: MDCLXVI.
*/
public class RomainNumeral{
   public static final int ONE = 1;
   public static final int FIVE =5;
   public static int[] numbers;
   public static String conversion(int number){
      int digit = getDigit(number);
      fillNumbersArr(number);
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<digit;i++){
         sb.append(getRomainAtDigit(numbers[i],digit-i));
      }
      return sb.toString();
   }
   public static int getDigit(int number){
      int numLeft = Integer.MAX_VALUE;
      int divident = 10;
      int digit = 0;
      while(numLeft!=number){
         numLeft = number%divident;
         divident*=10;
         digit++;
      }
      return digit;
   }
   /*
   number/Math.pow(10,digit) get the number[digit];
   number%Math.pow(10,digit-1) get the left number;
   */
   public static void fillNumbersArr(int number){
      int digit = getDigit(number);
      numbers = new int[digit];
      int numberLeft = number;
      for(int i=digit;i>0;i--){
         numbers[digit-i]= numberLeft/((int)Math.pow(10,i-1));
         numberLeft %= ((int)Math.pow(10,i-1));
      }
   }
   public static String getRomainAtDigit(int numberAtThisPosition,int digit){
      String letterOneAtThisDigit = getBaseLetter(ONE*(int)Math.pow(10,digit-1));
      String letterFiveAtThisDigit = getBaseLetter(FIVE*(int)Math.pow(10,digit-1));
      String LetterOneAtHigherDigit = getBaseLetter(ONE*(int)Math.pow(10,digit));
      return romainFormatter(numberAtThisPosition,letterOneAtThisDigit,letterFiveAtThisDigit,LetterOneAtHigherDigit);
   }
   public static String getBaseLetter(int digit){
      switch(digit){
         case 1:return "I";
         case 5:return "V";
         case 10:return "X";
         case 50:return "L";
         case 100:return "C";
         case 500:return "D";
         case 1000:return "M";
         default : "";
      }
      return "";
   }
   public static String romainFormatter(int numberAtThisPosition, String baseOne,String baseFive,String higherBaseOne){
      switch(numberAtThisPosition){
         case 1:return baseOne;
         case 2:return baseOne+baseOne;
         case 3:return baseOne+baseOne+baseOne;
         case 4:return baseOne+baseFive;
         case 5:return baseFive;
         case 6:return baseFive+baseOne;
         case 7:return baseFive+baseOne+baseOne;
         case 8:return baseFive+baseOne+baseOne+baseOne;
         case 9:return baseOne+higherBaseOne;
         default : "";
      }
      return "";
   }
   public static void main(String[] args) {
      System.out.println(conversion(3948));
   }
}
