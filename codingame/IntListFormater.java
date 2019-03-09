import java.util.Arrays;
import java.lang.StringBuilder;

public class IntListFormater{

   public static String rangeExtraction(int[] arr) {
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         //StringBuilder sb = new StringBuilder(String.format("%d",arr[0]));
         return "";
   }
   //find a sequence bigger than 3, return the index of ending,if not return 0;
   public static int sequenceBeginIndex(int beginIndex, int[] intArr){
         while(intArr[beginIndex]==intArr[beginIndex+1] && intArr[beginIndex+1]==intArr[beginIndex+2]){
            sequenceBeginIndex(++beginIndex,intArr);
         }
         return beginIndex+2;
   }

   public static void main(String[] args) {
      int[] data = {0,-3,-2,-1,2,10,30,15,16,18,19,20,-5};
      System.out.println(rangeExtraction(data));
   }
}
