public class TestClass{

   public void printClassName(Object obj){
      System.out.println(obj.toString()+" java class name is "+ obj.getClass().getName());
   }

   public void getObject(){
      //way 0:
      Demo demo0 = new Demo();
      //way 1:
      Class demo1 = demo0.getClass();
      //way 2:
      Class demo2 = Demo.class;
      //way 3:
      Class demo3 = null;
      try{
         demo3 = Class.forName("Demo");
      }catch(ClassNotFoundException e){
         e.printStackTrace();
      }
      compareObj(demo0,demo1);
      compareObj(demo0,demo2);
      compareObj(demo0,demo3);
   }

   public void compareObj(Object obj1,Object obj2){
      //System.out.println(obj1.toString()+"=="+obj2.toString()+":"+obj1 == obj2);
      System.out.println("result: "+obj1.toString()+" and "+obj2.toString()+". They are equal? "+(obj1 == obj2));
      //System.out.println(obj1 == obj2);
   }

   public static void main(String[]args){
      TestClass test = new TestClass();
      Demo demo = new Demo();
      demo.setName("do not call me, i will call you");

      test.printClassName(demo);
      test.getObject();

      //change class to Test
      TestClass testClass0 = new TestClass();
      Class testClass1 = testClass0.getClass();
      Class testClass2 = void.class;
      Class testClass3 = null;
      try{
         testClass3 = Class.forName("TestClass");
      }catch(ClassNotFoundException e){
         e.printStackTrace();
      }
      System.out.println("result: "+testClass1.getName());
      System.out.println("result: "+testClass2.getName());
      System.out.println("result: "+testClass3.getName());
      ClassUtil.printClassMethodMessage(test);
   }
}
