package DSA;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SwapingTwoNumInArray {
    public static void main(String[] args) {
        int array[] = {1, 4, 2, 6, 8, 5, 12};
        Scanner sc = new Scanner(System.in);

        System.out.print("Array indexes        : ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Before Swaping Array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\nEnter First Index : ");
        int index1 = sc.nextInt();
        System.out.print("Enter Second Index : ");
        int index2 = sc.nextInt();
        int tempVar = array[index1];
        array[index1] = array[index2];
        array[index2] = tempVar;
        System.out.print("\nAfter Swaping Array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
