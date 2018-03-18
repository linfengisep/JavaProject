
public class Dog extends Animal{

   public Dog(){}

   public void playWithOwner(){
      System.out.println("Playing with its Owner...   from Dog.java");
   }

   public String toString(){
      System.out.println("This is a Dog");
      return "This is a Dog";
   }

   public static void main(String[]args){
      Dog dog=new Dog();
      dog.playWithOwner();
      dog.move();
   }
}
