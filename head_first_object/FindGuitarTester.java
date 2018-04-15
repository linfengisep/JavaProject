import java.util.*;
public class FindGuitarTester{
   public static void main(String[]args){
      Inventory inventory = new Inventory();
      initializeInventory(inventory);

      Guitar whatEricaLikes = new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
      List guitarsList = inventory.search(whatEricaLikes);
      if(!guitarsList.isEmpty()){
         for(Iterator i=guitarsList.iterator();i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            System.out.println("Erica,your search result is "+
                  guitar.getBuilder()+" "+guitar.getModel()+" "+guitar.getType()+"... ");
         }
      }else{
         System.out.println("Sorry, we have nothing suitable for you.");
      }
   }
   private static void initializeInventory(Inventory inventory){
      inventory.addGuitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
      inventory.addGuitar("",0,Builder.MARTIN,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
      inventory.addGuitar("",100,Builder.OLSON,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
   }
}
