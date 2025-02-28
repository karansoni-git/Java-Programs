//finding absolute value of a number using ternary operator.
import java.util.Scanner;

public class absolute_ternary {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = n.nextInt();
        int no = num < 0 ? -num : num;
        System.out.println("absolute nnumber is:"+no);
    }
}
