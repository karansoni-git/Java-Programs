/* A palindrome number is a number that reads the same forward and backward. In other words, when reversed, it remains unchanged.

Examples of Palindrome Numbers:
Single-digit numbers: 0, 1, 2, 3, ..., 9 (All single-digit numbers are palindromes.)
Two-digit numbers: 11, 22, 33, 44, 55, 66, 77, 88, 99
Three-digit numbers: 101, 121, 131, 141, 151, 161, 171, 181, 191
Four-digit numbers: 1221, 1331, 1441, 1551, 1661, 1771, 1881, 1991
Larger numbers: 12321, 45654, 9876789
*/
import java.util.Scanner;

public class palindrome {

    public static void c_pal(int a) {
        int rev = 0, rem, check;
        check = a;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (check == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = n.nextInt();
        c_pal(num);
    }
}
