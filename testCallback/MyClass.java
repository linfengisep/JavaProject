import java.util.*;

public class MyClass{
   public void register(MyListener listener){
      listener.somethingHappened();
}  public static void main(String[]args){
   MyClass myClass = new MyClass();
   MyForm myForm = new MyForm();
   myClass.register(myForm);
   }
}
