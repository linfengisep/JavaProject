import java.util.*;
public class TestJavaReflect{
   public static Vector getClasssParents(){

      Vector cp  = new Vector();
      Class subClass = Student.class;;
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

   public static void main(String[]args){
   //from the name of class;
       try{
      Class classe = Class.forName("TestModule");
      System.out.println("classe de l'object chaine="+classe.getName());
      }catch(Exception e){
         e.printStackTrace();
      }

      System.out.println(getClasssParents().capacity());
   }
}
