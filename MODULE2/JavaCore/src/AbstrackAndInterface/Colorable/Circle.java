package AbstrackAndInterface.Colorable;

import AbstrackAndInterface.Resizeable.Shape;

public class Circle extends Shape {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPeri() {
        return radius * 2 * Math.PI;
    }
}