public class ThreadTest{
   public static void threadMessage(String message){
      String threadName = Thread.currentThread().getName();
      System.out.format("CurrentThreadName:%s,Message:%s%n",threadName,message);
   }
   public static class MessageLoop implements Runnable {
      public void run(){
         String[]capitals = {"Paris","Rome","London","Pékin","New York","Madrid",
         "Berlin","Istanbul","Madrid","Bruxelle"};
         try{
            for (int i=0;i<capitals.length;i++) {
               Thread.sleep(2000);//make the current thread pause for two seconds;
               threadMessage(capitals[i]);
            }
         }catch(InterruptedException e){
            System.out.println("Thread is interrupted"+e);
         }
      }

   }
   public static void main(String[] args) throws InterruptedException {
      threadMessage("beginning");
      long waitingTime = 60 * 60 * 1000;//default one hour
      //get the argument from command line input;
      if(args.length>0){
         try{
            waitingTime = Long.parseLong(args[0])*1000;
            //System.out.println("ok");
         }catch(NumberFormatException e){
            System.out.println("please tape in number of seconds:"+e);
            System.exit(11);//nonzero indicates anormal termination;
         }
      }
      threadMessage("thread waiting");
      long startTime = System.currentTimeMillis();
      //System.out.println("right now:"+startTime);
      Thread thread = new Thread(new MessageLoop());
      thread.start();
      threadMessage("starting thread");

      while(thread.isAlive()){
         threadMessage("waiting for capitals message loop termination");
         thread.join(1000);  //waiting for 1000 millisecond to let this thread to die;
         if((System.currentTimeMillis()- startTime) > waitingTime && thread.isAlive()){
            thread.interrupt();  //interrupt this thread when waitingtime is finished;
         }
      }
      threadMessage("the end");
   }
}
