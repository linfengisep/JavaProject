import com.bruceeckel.simpletest.*;
public class AnonymousConstructor{
   private static Test monitor = new Test();
   public static Base getBase(int i){
      return new Base(i){
         {
            System.out.println("inside instance initializer");
         }
         public void f(){
            System.out.println("inside anonymous f()");
         }
      };
   }
   public static void main(String[] args) {
      Base base = new getBase(10);
      base.f();
      monitor.expect(new String[]{
         "Base const, i =10",
         "inside instance init",
         "in f();"
      });
   }
}
