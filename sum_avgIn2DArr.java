
import java.util.Scanner;

public class sum_avgIn2DArr {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter row size:");
        int row = n.nextInt();
        System.out.print("Enter column size:");
        int column = n.nextInt();
        System.out.println("Enter Array elements:");
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element at array[" + i + "]" + "[" + j + "]:");
                arr[i][j] = n.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("sum of all elements of 2d array:" + sum);
        float t = row * column;
        float avg = sum / t;
        System.out.println("average of all ements of 2d array:" + avg);
    }
}
