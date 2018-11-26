import java.util.List;
import java.util.ArrayList;

public class BoxDemo{
   public static <U> void addBox(U u,java.util.List<Box<U>> boxLists){
      Box<U> box = new Box<>();
      box.set(u);
      boxLists.add(box);
   }

   public static <U> void outputBoxes(java.util.List<Box<U>> boxes){
      int counter = 0;
      for(Box<U> box : boxes){
         U boxContent = box.get();
         System.out.println("box:"+box.getClass().getName()+",its content:"+boxContent.toString());
         counter++;
      }
   }

   public static void main(String[] args) {
      java.util.ArrayList<Box<Integer>> integerBoxes = new java.util.ArrayList<>();
      BoxDemo.<Integer>addBox(Integer.valueOf(10),integerBoxes);
      //without type witness,Java compiler still automatically infers (from the method's arguments) that the type parameter
      BoxDemo.addBox(Integer.valueOf(2),integerBoxes);
      BoxDemo.addBox(Integer.valueOf(3),integerBoxes);
      BoxDemo.outputBoxes(integerBoxes);
   }
}
