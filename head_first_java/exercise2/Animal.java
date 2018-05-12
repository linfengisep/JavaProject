public class Animal{
   public abstract void eat();

   public void testStaticMathod(){
   eat();
   }
   public static void main(String[]args){
      Animal animal = new Animal();
      animal.testStaticMathod();
   }
}
