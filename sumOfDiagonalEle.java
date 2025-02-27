/*sum of diagonal elements = left diagonal elements+ right diagonal elements
example:
1  2  3 
4  5  6
7  8  9

left digonal elements are : 1,5,9
logic : if => arr[i] == arr[j] then add that element.

right diagonal elements are : 3,5,7
logic : if sum of arr[i] + arr[j] == arr.length - 1 then add that element.   

here 5 is occurs two times so we will subtract it one times from sum of diagonal elements.
so the answer is : 1+5+9+3+7 = 25
here remember sum of diagonal elements works only when rows and column size is same 
other wise it can not sum properly.
 */
import java.util.Scanner;

public class sumOfDiagonalEle {

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

        //sum of left diagonal elements.
        int leftsum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i] == arr[j]) {
                    leftsum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements:" + leftsum);

        //sum of right diagonal elements.
        int rightsum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int s = i + j;
                if(s == arr.length - 1){
                    rightsum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal elements:" + rightsum);

        //sum of left and right diagonal elements.
        int totalsum = leftsum + rightsum;
        if (arr.length % 2 != 0) {
            int center = arr.length / 2;
            totalsum = totalsum - arr[center][center];
            System.out.println("done");
        }
        System.out.println("Sum of diagnoal elements of 2D array:" + totalsum);
    }
}
