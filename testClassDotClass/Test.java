public class Test{
   public static void main(String[]args){
/*
   Country country1 = new Country(86,"Chinese");
      String countryLanguage = args[0];
      country1.countryLanguage(countryLanguage);

      System.out.println("****************************");

      Country.City oneCity = country1.new City("henan",2000);
      String one = args[1];
      oneCity.citySpecial(one);
*/

      System.out.println("***************second way to call nested class*************");
      Country.City city2 = new Country.City("Tianjin",50);
      String two = args[0];
      city2.citySpecial(two);
   }
}
