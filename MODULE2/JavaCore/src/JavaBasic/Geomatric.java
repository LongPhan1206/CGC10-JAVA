package JavaBasic;

import java.util.Scanner;

public class Geomatric {
    public static void main(String[] args) {
        int choice= -1;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while ( choice != 0){
            choice = input.nextInt();
            switch (choice) {
                case 1:
                   for (int i = 1; i <= 5; i++) {
                       for (int j = 1; j <= 3; j++) {
                           System.out.println("*");
                       }
                   }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}