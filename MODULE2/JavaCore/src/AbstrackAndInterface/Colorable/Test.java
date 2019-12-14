package AbstrackAndInterface.Colorable;

import AbstrackAndInterface.Resizeable.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(7, 9);
        shapes[2] = new Square(6);
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }




    }
}
