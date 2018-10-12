public class SleepThread {
   public static void main(String[] args) throws InterruptedException {
      String arrString[]={"Paris","Rome","London","Pékin","New York","Madrid","Berlin"};
         Thread.sleep(3000);
         System.out.println("thread one finished");
      for (int i=0;i<arrString.length;i++) {
         //cause the current runing thread to pause for a period of time.
         try{
         Thread.sleep(1500);
         }catch(InterruptedException e){
            return ;
         }
         System.out.println(arrString[i]);
      }
   }
}
