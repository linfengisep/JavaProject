import java.util.*;

public class Inventory{
   private List guitars;
   public Inventory(){
      guitars = new LinkedList();
   }
   public void addGuitar(String serialNumber,double price,Builder builder,String model,Type type,Wood backWood,Wood topWood){
      Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
      guitars.add(guitar);
   }

   public Guitar getGuitar(String serialNumber){
      for(Iterator i = guitars.iterator();i.hasNext();){
         Guitar guitar = (Guitar) i.next();
         if(guitar.getSerialNumber().equals(serialNumber)){
               return guitar;
            }
      }
      return null;
   }

   public List search(Guitar searchGuitar){
      List matchingGuitar = new LinkedList();
      for(Iterator i = guitars.iterator();i.hasNext();){
         Guitar guitar =(Guitar)i.next();
         String builder = searchGuitar.getBuilder().toString();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder().toString())))
               continue;
         String model = searchGuitar.getModel().toLowerCase();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getModel().toLowerCase())))
            continue;
         String type = searchGuitar.getType().toString();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getType().toString())))
                  continue;
         String backWood = searchGuitar.getBackWood().toString();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getBackWood().toString())))
                  continue;
         String topWood = searchGuitar.getTopWood().toString();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getTopWood().toString())))
               continue;
         matchingGuitar.add(guitar);
         }
         return matchingGuitar;
   }
}
