public class RentCar{
   private int rate;
   private String type;
   public int price;
   public RentCar(int price){
      if (price < 50) {
           type = "Basic car";
           rate = 35;
      } else if ((price >= 50) && (price < 80)) {
           type = "Medium";
           rate = 45;
      } else if (price >= 80) {
           type = "Luxry";
           rate = 55;
      }
   }

   public int getRate(){return this.rate;}
   public void setRate(int rate){this.rate = rate;}
   public String getType(){return this.type;}
   public void setType(String type){this.type = type;}
   public int getPrice(){return this.price;}
   public void setPrice(int price){this.price = price;}
   public void computeCost(int numberOfDay){
      int totalPrice = numberOfDay*price;
      System.out.println("The cost of the car is: "+totalPrice+" USD");
   }
}
