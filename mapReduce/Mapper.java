import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
public class Mapper implements Function<String,List<DataPair<String,Integer>>>{
   /*
   apply this function to the given argument:s
   param:String
   return type:List
   */
   @Override
   public List<DataPair<String,Integer>> apply(String sentence){
      String[] words = sentence.toUpperCase().split("\\W");
      List<DataPair<String,Integer>> wordsList = new ArrayList<>();
      for(String w : words){wordsList.add(new DataPair(w.toUpperCase(),1));}
      return wordsList;
   }
}
