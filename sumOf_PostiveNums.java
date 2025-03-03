//sum of all positive number in array using foreach loop.

import java.util.Scanner;

public class sumOf_PostiveNums {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = n.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            arr[i] = n.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("Sum of all positive number sin array:" + sum);
    }
}
