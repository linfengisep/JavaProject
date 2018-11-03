public class Client{
   protected BusinessDelegate businessDelegate;
   public Client(BusinessDelegate delegate){
      this.businessDelegate = delegate;
   }

   public void doTask(){
      businessDelegate.doTask();
   }
}
