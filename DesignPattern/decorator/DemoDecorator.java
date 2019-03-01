public class DemoDecorator{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCicle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCicle.draw();
        redRectangle.draw();
    }
}
