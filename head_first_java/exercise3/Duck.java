public class Duck{
   public static int duckCount=0;
   public String duckColor = null;
   public final int size =10;
   public int price=2;

   public Duck(String color){
   this.duckColor = color;
   duckCount++;
   }
   public int getDuckNumber(){return duckCount;}
   public String getDuckColor(){return duckColor;}

   public void showAll(){
   System.out.println("duck color:"+getDuckColor());
   System.out.println("duck number:"+getDuckNumber());
   }
   //public static int changePrice(final int low){   //static method cannot access the non static variable;
   public static int changePrice(final int low){
      this.price = low;
      return low;
   }

   public static void main(String[]args){
      Duck duck1 = new Duck("blue");
      Duck duck2 = new Duck("yellow");
      Duck duck3 = new Duck("black");

      duck1.showAll();
      duck2.showAll();
      duck3.showAll();

      System.out.println("duck price:"+duck3.changePrice(3));
      //duck3.size = 20; cannot assign a value to a variable size;
      System.out.println("duckCount:"+Duck.duckCount+" from its instance duck1:"+duck1.duckCount);
      System.out.println("duck1 size:"+duck1.size+",duck2 size:"+duck2.size+",duck3 size:"+duck3.size);

   }
}
