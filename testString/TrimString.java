public class TrimString{

   public String s=null;

   public TrimString(String text){
   this.s=text;
   }

   public void showString(){
   String string=s.trim().toUpperCase();
   System.out.println("Your entered: "+string);
   }

   public static void main(String[]args){
   String string=args[0];

   TrimString trimString=new TrimString(string);
   trimString.showString();
   }
}
