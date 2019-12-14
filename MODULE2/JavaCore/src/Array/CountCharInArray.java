package Array;

import java.util.Scanner;

public class CountCharInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str = scanner.nextLine();
        System.out.println("Enter the character");
        char check;
        check = 'a';
        int count = 0;
        int i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == check) {
                count++;
            }
        }
        System.out.println("RESULT IS : " + count);
    }
}
