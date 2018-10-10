public class Parcel2{
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

   //return instance;
   public Contents cont(){
      return new Contents();
   }
   public Destination dest(String to){
      return new Destination(to);
   }
   //in the main static method, if wa want to instanciate an object of inner class, we need do with this pattern:
   // OutterClassName.InnerClassName;
   public static void main(String[] args) {
      Parcel2 p2 = new Parcel2();
      p2.ship("Rome");

      Parcel2 p22 = new Parcel2();
      Parcel2.Contents pCont = p22.cont();
      Parcel2.Destination pDest = p22.dest("Londons");
      System.out.println(pDest.label);
   }
}
