public class A6 implements Printable{
   public void print(){
   System.out.println("print paper");
   }
   public void size(){
      System.out.println("A6 has its own size");
   }
   public static void main(String[]args){
   A6 obj = new A6();
   obj.print();
   }
}
