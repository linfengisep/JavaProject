import java.util.*;
public class TestDate{
   public static void main(String[]args){
      Calendar calendar = Calendar.getInstance();
      calendar.set(2018,3,29,15,57);
      long day = calendar.getTimeInMillis();
      day +=1000*60*60;
      calendar.setTimeInMillis(day);
      System.out.println("new hour:"+calendar.get(calendar.HOUR_OF_DAY));
      calendar.add(calendar.DATE,35);
      System.out.println("add 35 days:"+calendar.getTime());
      calendar.roll(calendar.DATE,35);
      System.out.println("roll 35 days:"+calendar.getTime());
   }
}
