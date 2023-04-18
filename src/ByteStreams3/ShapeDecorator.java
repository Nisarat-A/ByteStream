package ByteStreams3;

public abstract class ShapeDecorator implements Shape {
     protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
        //attr       parameter
    }

      @Override
    public void draw() {
        shape.draw(); //call the draw method of the Shape object 5
}
}
