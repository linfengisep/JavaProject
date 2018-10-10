public class Parcel3{
   //inner class
   private class PContent{
      private int i = 11;
      public int value(){return i;}
   }

   //inner class
   protected class PDestination{
      private String label;
      private PDestination (String whereTo){
         label = whereTo;
      }
      public String readLabel(){
         return label;
      }
   }

   //method of class Parcel3;
   public PDestination dest (String s){
      return new PDestination(s);
   }
   public PContent cont(){
      return new PContent();
   }
}
//when you put the private accesse in the innerclass, it can not be accessed outside of this class.
