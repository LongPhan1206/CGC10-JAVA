package ClassAndObject;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1(double delta) {

        return (-b + Math.pow(delta, 0.5) / (2 * a));
    }

    public double getRoot2(double delta) {

        return (-b - Math.pow(delta, 0.5) / (2 * a));
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter the number a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the number b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the number c: ");
        c = scanner.nextDouble();
        QuadraticEquation ptbac2 = new QuadraticEquation(a, b, c);
        double delta = ptbac2.getDiscriminant();
        if (delta > 0) {
            System.out.println("x1 = " + ptbac2.getRoot1(delta));
            System.out.println("x2 = " + ptbac2.getRoot2(delta));
        }
        else if (delta == 0) {
            System.out.println("x = " + ptbac2.getRoot());
        }
        else System.out.println("The equation has no real roots");
    }
}
