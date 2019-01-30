import java.util.Arrays;
import java.lang.StringBuilder;

public class IntListFormater{

   public static String rangeExtraction(int[] arr) {
         Arrays.sort(arr);
         //replace all consicutive value with MIN_VALUE;
         int preValue = arr[0];
         for(int i=1;i<arr.length;i++){
            //System.out.println(arr[i]);
            if((preValue+1) == arr[i]){
               preValue = arr[i];
               arr[i] = Integer.MIN_VALUE;
               //System.out.println(arr[i]);
            }else{
               preValue = arr[i];
            }
         }
         System.out.println(Arrays.toString(arr));
         //replace the only one consicutive value with its original value;
         int num=0;
         for(int j=0;j<arr.length;j++){
            if(arr[j]==Integer.MIN_VALUE){
               num++;
               if(num==1 && arr[j+1] !=Integer.MIN_VALUE){
                  arr[j]=arr[j-1]+1;
               }
               num=0;
            }
         }

         System.out.println(Arrays.toString(arr));
         StringBuilder sb = new StringBuilder(String.format("%d",arr[0]));
         int numMin = 0;
         for(int j=1;j<arr.length;j++){
            if(arr[j]!=Integer.MIN_VALUE){
               sb.append(String.format(",%d",arr[j]));
            }else{
               numMin++;
               if(arr[j+1]!=Integer.MIN_VALUE){
                  //sb.append(String.format(",%d-%d",arr[j-numMin-1],arr[j-numMin-1]+numMin));
               }
            }
         }
    		return sb.toString();
   }

   public static void main(String[] args) {
      int[] data = {0,-3,-2,-1,2,10,30,15,16,18,19,20,-5};
      System.out.println(rangeExtraction(data));
   }
}
