package JavaBasic;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        width = scanner.nextFloat();
        System.out.print("Enter Heigth: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
