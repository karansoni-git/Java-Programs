
import java.util.Scanner;

public class isArrPalindrome {

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
        boolean check = isPalin(arr);
        if (check) {
            System.out.println("Array is palidrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }

    public static boolean isPalin(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }

}
