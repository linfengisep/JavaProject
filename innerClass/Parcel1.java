public class Parcel1{
   //inner class
   class Contents{
      private int i = 11;
      public int value(){return i;}
   }
   //inner class
   class Destination{
      private String label;
      private Destination (String whereTo){
         label = whereTo;
      }
      public String readLabel(){
         return label;
      }
   }

   //method of class Parcel1;
   public void ship(String dest){
      Contents cont = new Contents();
      Destination destination = new Destination(dest);
      System.out.println(destination.readLabel());
   }

   //main
   public static void main(String[] args) {
      Parcel1 p1 = new Parcel1();
      p1.ship("Paris");
   }
}
