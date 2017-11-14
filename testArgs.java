import java.util.Scanner;

class testArgs {

   public static String myname="linfeng";
   public static String myNum="123456";

   static public void main(String [] args){
   System.out.println("Je m'appelle:"+myname);
      for(String s:args){
         System.out.println("les entrés sont bien le:"+s);
      }
   int stringToInteger=0;
   stringToInteger=Integer.parseInt(myNum);
   System.out.println("Your assumption->String to Integer is:"+stringToInteger);
   System.out.println("*******************test scanner*******************");
   Scanner sc = new Scanner(System.in);
   String string = sc.nextLine();
   System.out.println("You just input is: "+string);
   }
}
