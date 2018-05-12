public class Test{
   public String name;
   public Test(String name){this.name = name;}

   public void show(Test test1,Test test2){
      //when local varable not initilized,compiling will report error;
      /*int noInitilizedValue;
      System.out.println("no value:"+noInitilizedValue);
      */
   }

   public static void main(String[]args){
      Test testA = new Test("title");
      Test testB = new Test("title");
      Test testC = testB;
      if(testB.equals(testC)){
         System.out.println("testB equal testC");
      }else{
         System.out.println("testB not equal testC");
      }

      if(testB==testC){
         System.out.println("testB = testC");
      }else{
         System.out.println("testB != testC");
      }
   }
}
