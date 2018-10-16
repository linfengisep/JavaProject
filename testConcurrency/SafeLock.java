/*
1.tryLock():Acquires the lock only if it is not held by another thread at the time of invocation. return boolean;
2.unlock():Attempts to release this lock.
3.for(;;;){} :this is a infinite loop;
*/
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
public class SafeLock{

   public static class Friend {
      private final String name;
      //A ReentrantLock is owned by the thread last successfully locking, but not yet unlocking it
      private final Lock lock = new ReentrantLock();
      public Friend(String name){
         this.name = name;
      }
      public String getName(){
         return this.name;
      }
      //if all friend get their lock, then return true; else release the lock;
      public boolean impendingBow(Friend bower){
         Boolean myLock = false;
         Boolean yourLock = false;
         try{
            myLock = lock.tryLock();//get the lock of this object;
            yourLock = bower.lock.tryLock();//get the lock of the bower;
         }finally{
            if(!(myLock && yourLock)){
               if(myLock){lock.unlock();}
               if(yourLock){bower.lock.unlock();}
            }
         }
/*
         //test whether yourLock false result in no bowing
         Boolean bothLock = myLock && yourLock;
         if(!bothLock){
            System.out.println("Cause:myLock:"+myLock +",yourLock:"+yourLock);
         }
         return bothLock;
*/
         return myLock && yourLock;
      }

      //
      public void bow(Friend bower){
         if(impendingBow(bower)){
            try{
               //if all the participant get the their lock, do bow;
               System.out.format("%s:%s bowed to me %n",this.name,bower.getName());
               //at the same time, bow back;
               bower.bowBack(this);
            }finally{
               //release the their lock repectively;
               lock.unlock();
               bower.lock.unlock();
            }
         }else{
               System.out.format("Someone is going to bow,so stop bowing for the moment. %n");
         }
      }

      public void bowBack(Friend bower){
         System.out.format("%s:%s bowed back to me %n",this.name,bower.getName());
      }
   }

    static class BowLoop implements Runnable{
      private Friend bower;
      private Friend bowee;
      public BowLoop(Friend bower,Friend bowee){
         this.bower = bower;
         this.bowee = bowee;
      }

      public void run(){
         Random random = new Random();
         for (;;) {
            try{
               Thread.sleep(random.nextInt(200));//pause for a random time
            }catch(InterruptedException e){System.out.println("run exception"+e);}
            bower.bow(bowee);
         }
      }
   }

   public static void main(String[] args) {
      Friend sam = new Friend("Sam");
      Friend jerry = new Friend("Jerry");
      //Friend tom = new Friend("Tom");
      (new Thread(new BowLoop(sam,jerry))).start();
      (new Thread(new BowLoop(jerry,sam))).start();
      //(new Thread(new BowLoop(tom,sam))).start();
   }
}
