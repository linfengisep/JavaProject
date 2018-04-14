public class Guitar{
      private String serialNumber,builder,model,type,backWood,topWood;
      private double price;
      public Guitar(String serialNumber,double price,String builder,String model,String type,String topWood,String backWood){
      this.serialNumber = serialNumber;
      this.price = price;
      this.builder = builder;
      this.model = model;
      this.type = type;
      this.topWood = topWood;
      this.backWood = backWood;
   }
      public String getSerialNumber(){
      return serialNumber;
   }
      public double getPrice(){
      return price;
   }
      public void setPrice(float newPrice){
      this.price = newPrice;
   }
      public String getBuilder(){
      return builder;
   }
      public String getModel(){
      return model;
   }
      public String getType(){
      return type;
   }
      public String getBackWood(){
      return backWood;
   }
      public String getTopWood(){
      return topWood;
   }

}
