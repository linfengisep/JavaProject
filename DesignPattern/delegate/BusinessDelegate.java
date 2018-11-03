public class BusinessDelegate{
      protected BusinessLookup lookupService = new BusinessLookup();
      protected BusinessService businessService;
      protected String serviceType;

      public void setServiceType(String type){
         serviceType = type;
   }
      public void doTask(){
         businessService = lookupService.getBusinessService(serviceType);
         businessService.doProcessing();
   }
}
