import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test{
   //upper bounded wildcard;
   public static double sumOfList(List<? extends Number> myList){
      double total = 0.0;
      for(Number n:myList){
         total += n.doubleValue();
      }
      return total;
   }
   //upper bound wildcads
   public static void printList(List<?> list){
      for(Object o:list) System.out.println("element is:"+o.toString());
   }
   // public static void printList(List<Object> list){
   //    for(Object o:list) System.out.println("o:"+o.toString());
   // }

   //lower bound wildcard;
   public static void addNumbers(List<? super Integer> list){
      for(int i=0;i<10;i++){
         list.add(i);
      }
   }

   public static int countNumber(Collection<? extends Number> myCollections ){
      Iterator it = myCollections.iterator();
      int total = 0;
      while(it.hasNext()){
         total++;
         System.out.println(it.next());
         it.remove();
      }
      return total;
   }

   public static void main(String[] args) {
      List myList = new ArrayList();
      myList.add("hello");
      System.out.println((String) myList.get(0));

      //test Box.java;
      Box box = new Box();
      box.set("yes");
      System.out.println(box.get());

      box.set(new Integer(2));
      System.out.println(box.get());

      List<Double> doubleList = Arrays.asList(1.3,4.5,8.5);
      System.out.println("result:"+Test.sumOfList(doubleList));
      //List<Double> can't be converted to List<Object>;
      printList(doubleList);
      System.out.println("***************************");
      //test lower wildcads;
      List<Object> objectList = new ArrayList<>();
      addNumbers(objectList);
      printList(objectList);

      List<Integer> intList = new ArrayList<>();
      intList.add(3);
      intList.add(5);
      intList.add(2);
      intList.add(4);
      intList.add(6);
      System.out.println("total number:"+countNumber(intList));
   }
}
