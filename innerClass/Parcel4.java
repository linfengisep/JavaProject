/*
inner class is rather than being part of method public Destination dest();
this mothed return a reference of the class Destination; upcasting;
*/
public class Parcel4{
   public Destination dest(String s){
      class PDestination implements Destination {
            private String label;
            private PDestination (String whereTo){
               label = whereTo;
            }
            public String readLabel(){return label;}
      }
      return new PDestination(s);
   }

   public static void main(String[] args){
      Parcel4 p4 = new Parcel4();
      Destination pd = p4.dest("Maroc");
      if(pd !=null) System.out.println("pd is not null");
   }
}
