class Circle extends AbsFigure{
   public double radius;

   public Circle(double radius){
      this.radius = radius;
   }

   double area(double radius){
      return (radius*radius*Math.PI);
   }

   public static void main(String[]args){
      Circle circle = new Circle(4);
      System.out.println("circle area:= "+circle.area());
   }
}
