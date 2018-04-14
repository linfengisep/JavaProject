public class FindGuitarTester{
   public static void main(String[]args){
      Inventory inventory = new Inventory();
      initializeInventory(inventory);

      Guitar whatEricaLikes = new Guitar("",0,"fender","Stratocastor","electric","Alder","Alder");
      Guitar guitar = inventory.search(whatEricaLikes);
      if(guitar !=null){
         System.out.println("Erica,your search result is "+
               guitar.getBuilder()+" "+guitar.getModel()+" "+guitar.getType()+"... "
         );
      }else{
         System.out.println("Sorry, we have nothing suitable for you.");
      }
   }
   private static void initializeInventory(Inventory inventory){
      inventory.addGuitar("",0,"fender","Stratocastor","electric","Alder","Alder");
      inventory.addGuitar("",0,"beater","Stratocastor","electric","wood","wood");
      inventory.addGuitar("",100,"xiaomi","Stratocastor","electric","metal","wood");
   }
}
