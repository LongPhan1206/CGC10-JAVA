package JavaBasic;

import java.util.Scanner;

public class DivisorMax {
    public static void main(String[] args) {
        Scanner input_number = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a number a: ");
        a = input_number.nextInt();
        System.out.println("Enter a number b: ");
        b = input_number.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("No greatest common factor " + a);
    }
}
