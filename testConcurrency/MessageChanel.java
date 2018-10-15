public class MessageChanel{
   private boolean isEmpty = true;
   private String message;

   /*test
   public MessageChanel(String message){this.message = message;}
   */
   public synchronized void writeMessage(String message){
      //when the arrayMessage is not empty, this thread need wait to write new message in it;
      while(!isEmpty){
         try{
            this.wait();
         }catch(InterruptedException e){
            System.out.println("thread is interrupted");
         }
      }
         isEmpty = false;
         this.message = message;
         notifyAll();
   }

   public synchronized String readMessage(){
      while(isEmpty){
         try{
            this.wait();
         }catch(InterruptedException e){
            System.out.println("current thread is interrupted"+e);
         }
      }
         isEmpty = true;
         this.notifyAll();//status changed, lock is moved away;
         return this.message;
   }

}
