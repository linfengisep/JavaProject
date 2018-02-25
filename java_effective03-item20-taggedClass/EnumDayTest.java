public class EnumDayTest{
//enum type day;
   public enum Day{
   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
   }
//member variable;
   public Day day;
//constructor;
   public EnumDayTest(Day day){
      this.day = day;
   }
   public void tellItLikes(){
      switch(day){
         case MONDAY:
         System.out.println("Monday is bad");
         break;
         case FRIDAY:
         System.out.println("Friday is great");
         break;
         case SATURDAY: case SUNDAY:
         System.out.println("Weekend are great");
         break;
         default:
         System.out.println("Midweek days are just so so");
         break;
      }
   }

   public static void main(String[]args){
      EnumDayTest day1 = new EnumDayTest(Day.SUNDAY);
      day1.tellItLikes();
      EnumDayTest day2 = new EnumDayTest(Day.MONDAY);
      day2.tellItLikes();
      EnumDayTest day3 = new EnumDayTest(Day.THURSDAY);
      day3.tellItLikes();
   }
}
