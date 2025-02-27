//user defined fibinacci series
// import java.util.Scanner;

// public class fibonacci{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int f = 0, s = 1, next;
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         System.out.print("Fibonacci Series: " + f + " " + s + " ");
//         for(int i=2; i<n; i++)
//         {
//             next = f + s;
//             System.out.print(next + " ");
//             f = s;
//             s = next;
//         }
//     }
// }


public class fibonacci {
    public static void main(String[] args) {
        int n = 5; // Number of terms
        int first = 0, second = 1, next;

        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
