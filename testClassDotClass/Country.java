public class Country{
   public int countryNbr=0;
   public String countryName=null;

   public Country(int code,String name){
      this.countryNbr=code;
      this.countryName=name;
   }

   public void countryLanguage (String countryLanguage){
      System.out.println("We"+countryName+" speak "+countryLanguage);
   }
/*
   public class City{
      public String cityName=null;
      public int cityPIB = 0;
      public City(String city,int number){
      this.cityPIB=number;
      this.cityName=city;
      }
      public void citySpecial(String one){
         System.out.println("Our city "+cityName+" speciality is "+one);
      }
   }
*/
public static class City{
   public String cityName=null;
   public int cityPIB = 0;

   public City(String city,int number){
   this.cityPIB=number;
   this.cityName=city;
   }
   public void citySpecial(String one){
      System.out.println("Our city "+cityName+" speciality is "+one);
   }
}
}
