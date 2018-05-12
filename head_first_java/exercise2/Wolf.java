public class Wolf{
   Animal animal;
   public void showEating(){animal.eat();}

   public static void main(String[]args){
      Wolf wolf = new Wolf();
      wolf.showEating();
      System.out.println("**********");
      Animal.eat();
   }
}
