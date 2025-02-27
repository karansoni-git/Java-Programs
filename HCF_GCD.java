/*GCD (Greatest Common Divisor), also known as HCF (Highest Common Factor), is the largest number that can exactly divide two or more numbers without leaving a remainder.

Example:
Find the GCD of 12 and 18

Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
Common Factors: 1, 2, 3, 6
Greatest Common Factor (GCD) = 6 ✅
*/
import java.util.Scanner;

public class HCF_GCD {

    static void findgcd(int a, int b) {
        int lcm = 0;
        int max = Math.max(a, b);
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                lcm = i;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " : " + lcm);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = n.nextInt();
        System.out.print("Enter second number: ");
        int b = n.nextInt();
        findgcd(a, b);
    }
}
