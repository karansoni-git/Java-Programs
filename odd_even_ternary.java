//cheking number is odd or even using ternary operator.
import java.util.Scanner;

public class odd_even_ternary {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter an number to check odd or even:");
        int num = n.nextInt();
        System.out.println(num % 2 == 0? "even":"odd");
    }
}
