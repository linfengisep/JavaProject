import java.util.*;

public class Inventory{
   private List guitars;
   public Inventory(){
      guitars = new LinkedList();
   }
   public void addGuitar(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood){
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

   public Guitar search(Guitar searchGuitar){
      for(Iterator i = guitars.iterator();i.hasNext();){
         Guitar guitar =(Guitar)i.next();
         String builder = searchGuitar.getBuilder();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
            {continue;}else{return guitar;}
         String model = searchGuitar.getModel();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getModel())))
               {continue;}else{return guitar;}
         String type = searchGuitar.getType();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getType())))
               {continue;}else{return guitar;}
         String backWood = searchGuitar.getBackWood();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getBackWood())))
               {continue;}else{return guitar;}
         String topWood = searchGuitar.getTopWood();
         if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getTopWood())))
               {continue;}else{return guitar;}
         }
         return null;
   }
}
