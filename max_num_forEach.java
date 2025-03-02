//checking maximum number from an array using foreach loop.
import java.util.Scanner;

public class max_num_forEach{
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
        int max = Integer.MIN_VALUE;
        for(int check : arr)
        {
            if(max < check)
            {
                max = check;
            }
        }
        System.out.println("maximun number in array is : " + max);
    }
}