package JavaBasic;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double usd;
        double convert = 23000;
        System.out.print("Enter a USD: ");
        usd = input.nextDouble();
        System.out.print(usd + " USD = " + usd * convert + " VND");

    }
}
