package ByteStreams3;

public class LAB1   {
    public static void main(String[] args) {
     Circle Circle = new Circle();
     RedShapeDecorator CircleDecorator = new RedShapeDecorator(Circle);
        CircleDecorator.draw();
        Rectangle regtangle = new Rectangle();
        RedShapeDecorator regtangleDecorator = new RedShapeDecorator(regtangle);
        regtangleDecorator.draw();
    }

}
