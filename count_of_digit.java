
import java.util.Scanner;

public class count_of_digit {

    public static void main(String[] args) {
        int a, c = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number to count the digit: ");
        a = n.nextInt();
        while (a > 0) {
            a = a / 10;
            c++;
        }
        System.out.println("The number of digits in the number is: " + c);
    }
}
