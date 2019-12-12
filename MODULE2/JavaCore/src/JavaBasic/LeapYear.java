package JavaBasic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean check = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                check = true;
            }
        }
        else if (year % 4 == 0) {
            check = true;
        }
        if (check) {
            System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " is a NOT leap year");

    }
}
