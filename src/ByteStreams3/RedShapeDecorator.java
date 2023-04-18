package ByteStreams3;

public class RedShapeDecorator extends ShapeDecorator{

    //  ที่บีีทัดแรกลูกเรียกแม่เสมอ
    public RedShapeDecorator(Shape shape){
        super(shape);

    }
    @Override
    public void draw(){
        shape.draw();
        System.out.println("Border Color Hongse");
    }
}
