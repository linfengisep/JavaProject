class TestReturnString{
   String string=null;
   public TestReturnString(String s){
      this.string=s;
   }
   public void showString(){
      System.out.println("You just entered :"+string);
   }
   public String showReturnString(){
      return "Sophie_Marceau";
   }
   public static void main(String args[]){
   TestReturnString testString = new TestReturnString("Linfeng");
   testString.showString();
   System.out.print("Check the return string without predefined variable:");
   System.out.println(testString.showReturnString());
   }
}
