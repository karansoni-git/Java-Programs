//this program find a maximum and minimum number in array.
import java.util.Scanner;

public class maxAndMinInArray {

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
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum number in array is: " + max);
        System.out.println("minimum number in array is: " + min);
    }
}
