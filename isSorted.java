
import java.util.Scanner;

public class isSorted {

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
        System.out.println("Checking....");
        int c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                c++;
            }
        }
        if (c == size - 1) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
