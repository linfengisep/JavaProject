public class BusinessDelegateDemo{
   public static void main(String[] args) {
      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("Product");
      Client client = new Client(businessDelegate);
      client.doTask();
      businessDelegate.setServiceType("Markting");
      client.doTask();
   }
}
