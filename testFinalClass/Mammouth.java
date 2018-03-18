public class Mammouth{
   public String name="Mammouth";
   public void showName(){
         System.out.println(name);
   }

   //public Mammouth(String name){this.name = name;}
   private Mammouth(){};
   public static void main(String[]args){
   Mammouth mammouth = new Mammouth();
   mammouth.showName();
   }
}
