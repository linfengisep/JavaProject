public class Figure{
   enum Shape {
   RECTANGLE,CIRCLE
   };
   final Shape shape;
   //used only for shape is RECTANGLE;
   double length;
   double width;
   //used only for shape is CIRCLE;
   double radius;

   //constructor for circle;
   public Figure(double radius){
   this.shape = Shape.CIRCLE;
   this.radius = radius;
   }
   //constructor for retangle;
   public Figure(double length,double width){
   this.shape = Shape.RECTANGLE;
   this.length = length;
   this.width = width;
   }

   public double area(){
      switch(shape){
         case RECTANGLE:
            return length*width;
         case CIRCLE:
            return radius*radius*Math.PI*0.5;
         default:
            throw new AssertionError();
      }
   }

   public static void main(String[]args){
      Figure figure1 = new Figure(1.5);
      Figure figure2 = new Figure(2.4,1.6);
      System.out.println("circle area:= "+figure1.area());
      System.out.println("retangle area:= "+figure2.area());

   }
}
