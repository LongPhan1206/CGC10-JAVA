package AbstrackAndInterface.Resizeable;

public class Test extends Shape implements Resizeable{

    @Override
    public double resize(double percent) {
        return getArea() + getArea() * (percent/100);
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,7);
        shapes[2] = new Square(8);
        int percent = (int) Math.ceil(Math.random() * 100);
        System.out.println("Area before:");

        for (Shape shape: shapes) {
            System.out.println(shape.getArea());
        }

        System.out.println("Area after:");

        for (Shape shape: shapes) {
            System.out.println(shape.resize(percent));
        }

    }
}
