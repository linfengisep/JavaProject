/*
inside the loop, define inner class and instanciate it ok, outof loop, it doesn't work.
scope;
*/
public class Parcel5{
   private void internalTracking(boolean b){
      if(b){
         class TrackingSlip{
            private String id;
            TrackingSlip(String s){
               id = s;
            }
            String getSlip(){return id;}
         }
         TrackingSlip ts = new TrackingSlip("little slip");
         String s = ts.getSlip();

         if(s !=null) System.out.println(s);
      }
      //TrackingSlip testTS = new TrackingSlip("second slip"); // out of scope;
   }

   public void track(){internalTracking(true);}

   public static void main(String[]args){
      Parcel5 p5 = new Parcel5();
      p5.track();
   }
}
