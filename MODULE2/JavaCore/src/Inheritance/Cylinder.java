package Inheritance;

public class Cylinder extends Circle {
    private double width;

    public Cylinder() {
    }

    public Cylinder(double width, double radius, String color) {
        super(radius, color);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getVolume() {
        return super.getArea() * width;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + getRadius()
                + ", with width = "
                + getWidth()
                + " and with Volume = "
                + getVolume();
        //+ super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 7.0, "pink");
        System.out.println(cylinder);
    }
}
