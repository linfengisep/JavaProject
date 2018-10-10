public class Parcel8{
   public Destination dest(String destination){
      return new Destination(){
         private String label = destination;
         public String readLabel(){
            return label;
         }
      };
   }

   public static void main(String []args){
      Parcel8 p8 = new Parcel8();
      Destination d = p8.dest("Shanghai");
      System.out.println(d.readLabel());
   }
}
