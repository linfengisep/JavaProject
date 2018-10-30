public class AppleStockObserver implements Observer{
   private int lastValue =0;
   private Subject subject;

   public AppleStockObserver(Subject subject){
      this.subject = subject;
      subject.register(this);//register this observer instance;
   }
   @Override
   public void update(int value){
      lastValue = value;
      display(value);
   }

   public void display(int value){
      System.out.println("AppleStockObserver,received new value:"+value);
   }

   public void unregister(){
      subject.unregister(this);
   }
}
