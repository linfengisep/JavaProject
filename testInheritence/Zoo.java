import java.util.*;

public class Zoo{
   public List<Animal> zoo = new ArrayList<Animal>();

   public void putAnimal(Animal animal){
         zoo.add(animal);
   }

   public void showAnimal(){
      System.out.println("There are "+zoo.size()+" in the zoo.");
      for(int i=0;i<zoo.size();i++){
         zoo.get(i).toString();
      }
   }

   public static void main(String[]args){
      Zoo beauval = new Zoo();
      beauval.putAnimal(new Dog());
      beauval.putAnimal(new Dog());
      beauval.showAnimal();
   }
}
