enum Day {
       SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
       THURSDAY, FRIDAY, SATURDAY
}
public class EnumTest{
   public static void main(String[] args) {
      System.out.println("Day.SUNDAY.equals(Day.SUNDAY):"+Day.SUNDAY.equals(Day.SUNDAY));
      System.out.println("Day.SUNDAY == Day.SUNDAY:"+ (Day.SUNDAY == Day.SUNDAY));
      System.out.println("Day.MONDAY == Day.SUNDAY:"+ (Day.MONDAY == Day.SUNDAY));
   }
}
