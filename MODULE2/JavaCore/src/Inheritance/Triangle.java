package Inheritance;

import Inheritance.Shape.Shape;

public class Triangle extends Shape {
    private double side1, side2, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super.setColor(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPeri() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double P = getPeri() / 2;
        double S = P * (P - side1) * (P - side2) * (P - side3);
        return Math.sqrt(S);
    }

    @Override
    public String toString() {
        return "A Triangle with color = " + getColor()
                + ", side1 = " + side1
                + ", side2 = " + side2
                + ", side3 = " + side3
                + ", Area = " + getArea()
                + ", Perimeter = " + getPeri();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Brown", 3, 4, 5);
        System.out.println(triangle);
    }
}
