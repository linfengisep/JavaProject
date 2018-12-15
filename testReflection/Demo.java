import java.lang.Class;

public class Demo{
   public static void main(String[] args) {
      RentCar myCar = new RentCar(20);
      Class c = myCar.getClass();
      System.out.println(c);
      System.out.println("/************/");
      byte[] bytes = new byte[1024];
      Class b = bytes.getClass();
      System.out.println(b);
      System.out.println("/************/");
      boolean booValue;
      Class boo = boolean.class;
      System.out.println(boo);
      System.out.println("/************/");
      try{
      Class nameMethod = Class.forName("RentCar");
         System.out.println(nameMethod);
      }catch(ClassNotFoundException e){
         System.out.println("exception:"+e);
      }
      System.out.println("/************/");
      Class voidd = Void.TYPE;
      System.out.println(voidd);
   }
}
