import java.util.*;

public class TestTreeMap{
   public static void main(String[]args){
      TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
      tm.put(4,"linfeng");
      tm.put(2,"luyan");
      tm.put(1,"jiajun");

      for(Map.Entry m:tm.entrySet()){
      System.out.println("Key: "+m.getKey()+", Value: "+m.getValue());
      }
   }
}
