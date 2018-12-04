import java.util.*;
public class GenericMethod{
   public static <T> void swap(T[] arr,int index1, int index2){
      if(index1 > arr.length || index2 > arr.length) System.exit(0);
      T temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }

   public static Number getMax(List<? extends Number> list, int begin, int end){
      if(begin > end || begin < 0 || end > list.size() ) System.exit(0);
      Number max = list.get(begin);
      for(int i = begin; i<end; i++){
         if(max.intValue() < list.get(i).intValue()) max = list.get(i);
      }
      return max;
   }

   public static void main(String[] args) {
      String[] list = {"yes","non","test"};
      GenericMethod.swap(list,0,1);
      for(String s : list) System.out.println("element:"+s);

      List<Integer> intList = Arrays.asList(1,3,5,29,48,4,0,54,7);
      System.out.println(GenericMethod.getMax(intList,2,8));
   }
}
