//check a number which is how many times occurrs in ana array using foreach loop.
import java.util.Scanner;

public class occurrence_forEach {

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
        System.out.print("Enter that you want to search in array:");
        int check = n.nextInt();
        int count = 0;
        for (int num : arr) {
            if (check == num) {
                count++;
            }
        }
    System.out.println(check+" number occurr " + count + " times in array");
    }
}
