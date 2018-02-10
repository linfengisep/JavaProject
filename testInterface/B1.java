public class B1 implements Printable{
   public void print(){
   System.out.println("print sth");
   }

   public void doSth(){
   System.out.println("Do sth different from the interface method");
   }
   public static void main(String[]args){
   Printable b1 = new B1();
   b1.print();
   b1.doSth();
   }
}
