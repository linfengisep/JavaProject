/*
1.anonymous declaration of one thread; new Thread(new Runnable(){public void run(){the thread content}})
2.start the thread instance: start(); and some other methods of thread:sleep(),join(),getName(),interrupt(); 
*/
public class DeadLockTest{
   static class Person{
      private String name;
      public Person(String name){
         this.name = name;
      }
      public String getName(){
         return this.name;
      }
      public synchronized void shakeHand(Person person){
         System.out.format("%s:%s"+" shake hands with me.%n",this.name,person.getName());
         //after shaking hands, need release;
         person.releaseHand(this);
      }
      public synchronized void releaseHand(Person person){
         System.out.format("%s:%s"+" release my hands.%n",this.name,person.getName());
      }
   }

   public static void main(String[] args) {
         final Person sam = new Person("Sam");
         final Person lola = new Person("Lola");
         new Thread(new Runnable(){
            public void run(){
               sam.shakeHand(lola);
            }
         }).start();
         new Thread(new Runnable(){
            public void run(){
               lola.shakeHand(sam);
            }
         }).start();
   }
}
