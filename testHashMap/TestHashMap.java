import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestHashMap {
   public static void main(String[] args) {
      Map<Integer, String> hm = new HashMap<>();
      hm.put(10, "a");
      hm.put(20, "b");
      hm.put(30, "g");
      hm.put(40, "v");
      hm.put(50, "j");
      //override the 50;
      hm.put(50, "v");

      System.out.println("iterate map : ");
      Set<Entry<Integer, String>> setHm = hm.entrySet();
      Iterator<Entry<Integer, String>> it = setHm.iterator();
      while(it.hasNext()){
         Entry<Integer, String> e = it.next();
         System.out.println(e.getKey() + " : " + e.getValue());
      }

      System.out.println("value of key 8 : " + hm.get(8));

      Map<Integer, String> lhm = new LinkedHashMap<>();
      lhm.put(10, "2");
      lhm.put(20, "4");
      lhm.put(30, "6");
      lhm.put(40, "7");
      lhm.put(50, "10");

      System.out.println("iterate LinkedHashMap : ");
      Set<Entry<Integer, String>> setLhm = lhm.entrySet();
      Iterator<Entry<Integer, String>> it2 = setLhm.iterator();
      while(it2.hasNext()){
         Entry<Integer, String> e = it2.next();
         System.out.println(e.getKey() + " : " + e.getValue());
      }
   }
}
