public class Mapper implements Function<String, List<DataPair<String,Integer>>>{
   @Override
   public List<DataPair<String,Integer>> apply(String line){
      String [] d = s.toUpperCase().split("\\W");
      List<DataPair<String,Integer>> res = new ArrayList<>();
      for(String w:d) res.add(new DataPair<>(w.toUpperCase(),1));
      return res;
   }
}
