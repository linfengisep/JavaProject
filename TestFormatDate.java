import java.util.*;
import java.text.SimpleDateFormat;
public class TestFormatDate{
   private final static long ONEDAY=24*60*60*1000;
   private final static long ONEWEEK = 7*ONEDAY;

   public HashMap<String,Long> timeSet = new HashMap<String,Long>();

   public void prepareData(HashMap<String,Long> timeData){
      timeData.put("07/03/2018-21h:46",1520455578000L);
      timeData.put("15/04/2018-21h:46",1523821578000L);
      timeData.put("10/04/2018-21h:46",1523389578000L);
      timeData.put("16/04/2018-20h:00",1523901610000L);
   }

   public void displayDataSet(HashMap<String,Long> playSet){
      Set set = playSet.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()){
         Map.Entry mapEntry = (Map.Entry)iterator.next();
         System.out.println(formatTimeByDate(((Long)mapEntry.getValue()).longValue()));
      }
   }

   public String formatTimeByDate(long time){
      long currentTime = System.currentTimeMillis();
      long dayDifference = compareDifference(time,currentTime);
      if(dayDifference == 0){
         return new SimpleDateFormat("hh:mm").format(new Date(time));
      }else if(dayDifference ==1){
         return "hier";
      }else if(dayDifference>1 && dayDifference <7){
         return new SimpleDateFormat("EEE").format(new Date(time));
      }else if(dayDifference >7){
         return new SimpleDateFormat("dd/MM/yyyy").format(new Date(time));
      }else{
         return "error";
      }
   }

   public long compareDifference(long timeInHistory,long currentTime){
      return getNumberOfDayFromEpoch(currentTime)-getNumberOfDayFromEpoch(timeInHistory);
   }

   public long getNumberOfDayFromEpoch(long time){
      long seconds = time / 1000;
      long minutes = seconds / 60;
      long hours = minutes / 60;
      long days = hours / 24;
      return days;
   }

   public static void main(String[]args){
      TestFormatDate test = new TestFormatDate();
      test.prepareData(test.timeSet);
      test.displayDataSet(test.timeSet);
   }
}
