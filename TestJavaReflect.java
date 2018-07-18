import java.util.*;
public class TestJavaReflect{
   public static Vector getClasssParents(){

      Vector cp  = new Vector();
      Class subClass = TestModule.class;;
      Class superClass;
      cp.add(subClass.getName());
      superClass = subClass.getSuperClass();
      while(superClass !=null){
         cp.add(0,superClass.getName());
         subClass = superClass;
         superClass = subClass.getSuperClass();
      }
      return cp;
   }

   @override public int superMethod(){
      System.out.println("method implemented from super class");
   }

   public static void main(String[]args){
   //from the name of class;
       try{
      Class classe = Class.forName("TestModule");
      System.out.println("classe de l'object chaine="+classe.getName());

      System.out.println(getClasssParents().capacity());
      }catch(Exception e){
         e.printStackTrace();
      }

   /*
      Class c = TestModule.class;
      System.out.println("class de object:="+c.getName());
   */


   }


/*as long as the class is in the same file, we can use:
Class.forName();
ClassName.class();
*/
}
