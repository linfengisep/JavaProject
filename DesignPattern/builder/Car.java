public class Car{
      private String brand;
      private int price;
      private int year;
   //inner class should be static, to make sure the access to its methods without instanciation.
   public static class CarBuilder{
      private String brand;
      private int price;
      private int year;
      //create an instance of the CarBuilder;


      public CarBuilder withBrand(String brand){
            this.brand = brand;
            return this;//return the instance with brand state;
      }

      public CarBuilder withPrice(int price){
            this.price = price;
            return this;
      }

      public CarBuilder withYear(int year){
            this.year = year;
            return this;
      }
      //through this build(),it will affect the value pass by with*() to the field of Car;
      public Car build(){
         Car car = new Car();//call the private Car constructor inside this class;
         car.brand = this.brand;
         car.price = this.price;
         car.year = this.year;
         return car;
      }
   }

      private Car(){}

      public void showCar(){
         System.out.println("Brand:"+brand+",price:"+price+",year:"+year);
      }

      public static void main(String[] args) {
         Car audiCar = new CarBuilder()
                   .withBrand("Audi")
                   .withPrice(40000)
                   .withYear(2018)
                   .build();
         audiCar.showCar();

         Car ferrari = new CarBuilder()
                   .withBrand("Ferrari")
                   .withPrice(50000)
                   .withYear(2017)
                   .build();
         ferrari.showCar();
      }
}
