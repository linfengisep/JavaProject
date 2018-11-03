public class BusinessLookup{
   public BusinessService getBusinessService(String businessType){
      if(businessType.equalsIgnoreCase("Product")){
         return new ProductBusinessServiceImpl();
      }else if(businessType.equalsIgnoreCase("Markting")){
         return new MarkingBusinessServiceImpl();
      }
      return null;
   }
}
