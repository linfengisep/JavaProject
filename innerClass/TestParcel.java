
public class TestParcel{
   public static void main(String[] args) {
      Parcel3 p3 = new Parcel3();
      Parcel3.PContent c = p3.cont();  //did't work, because of its private access.
      Parcel3.PDestination d = p3.dest("Pékin");
      if(c != null) System.out.println("c is not null.");

      if(d != null) System.out.println("d is not null.");
    }
}
