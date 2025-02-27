
import java.util.Scanner;

public class two_d_array {

    public static void main(String[] args) {
        int i , j ;
        Scanner n = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (i = 0; i < 3; i++) {
            System.out.print("Enter student rollno : ");
            arr[i][0] = n.nextInt();
            for (j = 0; j < 3; j++) {
                System.out.print("Enter " + (j + 1) + " subject marks : ");
                arr[0][j] = n.nextInt();
            }
        }
        System.out.println("------------------------------");
        System.out.println("Result of students");
        for (i = 0; i < 3; i++) {
            System.out.println("rollno " + arr[i][0] + " student :");
            for (j = 0; j < 3; j++) {
                System.out.println((j + 1) + " subject marks : " + arr[0][j]);
            }
        }
    }
}
