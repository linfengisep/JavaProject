/**
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

class ConcurrentSkipListMap {
   ConcurrentNavigableMap<String,String> villPays=new ConcurrentSkipListMap<String,String>();

   villPays.add("madrid","spain");
   villPays.add("paris","france");
   villPays.add("pekin","chine");
   villPays.add("newyork","etatsunis");
   villPays.add("londons","royaume-uni");

   Set<Map.Entry<String, String>> villeSet = villPays.entrySet();
   villeSet.forEach((m)->System.out.println("key " + m.getKey() + " value " + m.getValue()));
}

**/
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TestConcurrentSkipListMap {

    public static void main(String[] args) {
        ConcurrentNavigableMap<String, String> cityMap = new ConcurrentSkipListMap<String, String>();
        cityMap.put("ND", "New Delhi");
        cityMap.put("MU", "Mumbai");
        cityMap.put("CH", "Chennai");
        cityMap.put("HD", "Hyderabad");
        Set<Map.Entry<String, String>> citySet = cityMap.entrySet();
        citySet.forEach((m)->System.out.println("key " + m.getKey()
                 + " value " + m.getValue()));

    }
}
