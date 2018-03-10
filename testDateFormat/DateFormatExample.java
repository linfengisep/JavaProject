import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatExample{
public static void main(String[]args){
   System.out.println("***********DateFormat to format date objects***************");
   Date now = new Date();
   System.out.println("1.new:");
   System.out.println(now.toString());
   //try the default dateformat;
   System.out.println("2.default dateformater:");
   System.out.println(DateFormat.getInstance().format(now));
   //try the time formate;
   System.out.println("3.default time dateformater:");
   System.out.println(DateFormat.getTimeInstance().format(now));
   System.out.println("4.default date time dateformater:");
   System.out.println(DateFormat.getDateTimeInstance().format(now));
   System.out.println("5.default date time dateformater with style:");
   System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(now));

   System.out.println("***********Parsing string to date objects***************");
    String dateString = "Nov 4, 2003 8:14 PM";
   DateFormat dateformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT);
   try{
   Date date = dateformat.parse(dateString);
   System.out.println("Original date :"+dateString);
   System.out.println("Parsed date :"+date.toString());
   }catch(ParseException pe){
   System.out.println("Parsing error"+pe);
   }

   System.out.println("***********Using SimpleDateFormat to build custom format***************");
   Date today = new Date();
   String stringDay = today.toString();
   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
   try{
   Date parsedDate = simpleDateFormat.parse(stringDay);
      System.out.println("Parsed date:"+parsedDate);
   }catch(ParseException pe){
      System.out.println("error "+pe);
   }
   }
}
