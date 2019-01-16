public class Test{
   public static int[] foldArray(int[] array, int runs){
      int[] arr = array;
      while(runs !=0){
         arr = folding(arr);
         runs--;
      }
      return arr;
   }

   public static int[] folding(int[]array){
      int[] arr;
      boolean isEven = array.length %2==0;
      if(isEven){
      arr = new int[array.length/2];
         for(int i=0;i<array.length/2;i++){
            arr[i]=array[i]+array[array.length-1-i];
         }
      }else{
      arr = new int[array.length/2+1];
         for(int i=0;i<array.length/2+1;i++){
            if(i != array.length/2){
                  arr[i]=array[i]+array[array.length-1-i];
            }else{
                  arr[i]=array[i];
            }
         }
      }
      return arr;
   }
   public static void display(int[] arrDisplay){
      for(Integer i:arrDisplay){
         System.out.print(i+", ");
      }
      System.out.println(" ");
   }
   public static void main(String[] args) {
      display(foldArray(new int[] {1,2,3,4,5,6,7},1));
   }
}
