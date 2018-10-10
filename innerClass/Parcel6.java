/*
//anonymous inner class,it hasn't a class keyword;
*/
public class Parcel6{
   public Content cont(){
      return new Content(){
         private int i=1;
         public int value(){return i;}
      };
   }

   public static void main(String[] args){
      Parcel6 p6 = new Parcel6();
      Content c = p6.cont();
      if(c !=null) System.out.println("c is not null");
   }
}
