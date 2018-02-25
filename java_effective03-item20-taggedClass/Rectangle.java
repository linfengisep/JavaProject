class Rectangle extends AbsFigure{
   public double length;
   public double width;

   public Rectangle(double length,double width){
      this.length = length;
      this.width = width;
   }

   double area(double length,double width){
      return length*width;
   }

   public static void main(String[]args){
      Rectangle rectangle = new Rectangle(2,4);
      System.out.println("rectangle area := "+rectangle.area());
   }
}
