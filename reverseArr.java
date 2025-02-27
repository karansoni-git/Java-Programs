
import java.util.Scanner;

// public class reverseArr {
//     public static void main(String[] args) {
//         Scanner n = new Scanner(System.in);
//         System.out.print("Enter array size: ");
//         int size = n.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter array elements:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter " + (i + 1) + " number: ");
//             arr[i] = n.nextInt();
//         }
//         System.out.println("Reverse Array:");
//         for(int i=arr.length-1; i>=0; i--)
//         {
//             System.out.println(arr[i]);
//         }
//     }
// }


//second method to reverse a original array
public class reverseArr {

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
        int half = arr.length / 2;
        int temp;
        for (int i = 0; i < half; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("reverse array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
