public class A4 extends A6 implements Printable,Showable{
   @Override
   public void print(){
   System.out.println("print paper A4");
   }
   @Override
   public void show(){
   System.out.println("show sth from show() method.");
   }

   @Override
   public void size(){
   System.out.println("A4 Override A6's size() method.");
   }
   public static void main(String[]args){
   A4 a4 = new A4();
   a4.print();
   a4.show();
   a4.size();
   }
}
