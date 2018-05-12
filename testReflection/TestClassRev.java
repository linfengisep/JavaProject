import java.lang.Class<?> ;
public class TestClassRev{
   public static void main(String[]args){
      Class c = "foo".getClass();
      Class d = System.console().getClass();
      //if type is available but there is no instance of class, then it is possible to obtain a Class
      //by appending ".class" to the name of the type;
      Class e = boolean.class;
      e = true;
      if(e) System.out.println("e: "+e);
   }
}
