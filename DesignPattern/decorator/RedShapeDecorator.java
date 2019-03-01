public class RedShapeDecorator extends ShapeDecorator{
    Shape decoratedShape;
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.println("border:red");
    }
}
