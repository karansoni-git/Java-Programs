//2d array with user input and 2d representation
import java.util.Scanner;

public class twod_array {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter nine numbers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = n.nextInt();
            }
        }
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
