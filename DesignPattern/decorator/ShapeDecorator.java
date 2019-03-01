public abstract class ShapeDecorator implements Shape {
    Shape decoratedShape;
    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }
    @Override
    public void draw(){
        this.decoratedShape.draw();
    }
}
