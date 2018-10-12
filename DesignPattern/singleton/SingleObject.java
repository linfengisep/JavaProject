public class SingleObject{
   private SingleObject(){}//private constructor prevent it from being instanciated by others.
   private static SingleObject oneInstance = new SingleObject();

   public static SingleObject getObject(){
         return oneInstance;
   }

   public void showMessage(){
      System.out.println("in the instance");
   }
}
