//this program find how many times a number occurrence in array
import java.util.Scanner;

public class noOfOccurrence {

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
        System.out.print("Enter number that you want to seach in array: ");
        int count = 0;
        int num = n.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(num + " found " + count + " times in array");
    }
}
