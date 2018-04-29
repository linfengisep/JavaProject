import java.lang.reflect.Method;
public class ClassUtil{
   public static void printClassMethodMessage(Object obj){
      //get the class type of object;
      Class c = obj.getClass();
      System.out.println("1.Name of class is:"+c.getName());
      //method is object as well;
      Method[] ms = c.getMethods();
      //get the methods' name;
      for(int i=0;i<ms.length;i++){
         //get methods' return type;
         Class methodReturnType = ms[i].getReturnType();
         System.out.print("methods' name :"+methodReturnType.getName());
         System.out.print(ms[i].getName()+"()");
         Class[] paramTypes = ms[i].getParameterTypes();
         for(Class classObject : paramTypes){
            System.out.print(classObject.getName()+",");
         }
         System.out.println(")");
      }
   }
}
