package Array;

import java.util.Scanner;

public class AddElenmetArray {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        //System.out.print("Nhập các phần tử của mảng: ");

        for (i = 0; i < n; i++) {
            System.out.print("Enter the element " + "[" + i + "] = ");
            //System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the index: ");
        int j = scanner.nextInt();
        System.out.print("Enter the value: ");
        int x = scanner.nextInt();

        for (i = arr.length - 1; i > j; i--) {
            arr[i] = arr[i - 1];
        }
        arr[j] = x;

        for (int element : arr) {
            System.out.print(element + "\t");
        }


    }
}
