
import java.util.Scanner;

public class searchIn2dArr {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int row = n.nextInt();
        System.out.print("Enter column size : ");
        int column = n.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("element row : " + (i + 1) + " column : " + (j + 1) + " = ");
                arr[i][j] = n.nextInt();
            }
        }
        boolean isfound = search(arr, row, column);
        if(isfound)
        {
            System.out.println("number found in 2D Array");
        }else{
            System.out.println("number is not found in 2D Array");
        }
    }

    public static boolean search(int[][] arr, int row, int column) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number that you want to search:");
        int num = n.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (num == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
