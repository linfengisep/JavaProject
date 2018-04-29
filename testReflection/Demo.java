public class Demo{
   public String demoName;
   public boolean isShow = false;

   public void setName (String name){
   this.demoName = name;
   }

   public void selfPresentation(){
   System.out.println("the name is: "+this.demoName);
   }

   public void setShow(boolean isShow){
   this.isShow = isShow;
   }

   public void checkShow(){
      if(this.isShow){
         System.out.println("show off");
      }
   }

   public void getPrivateField(){
      int bitCoinNumber = 10;
      System.out.println("show bitCoinNumber:"+bitCoinNumber);
   }
}
