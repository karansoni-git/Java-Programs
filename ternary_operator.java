/*the ternary operator is a shorthand way of writing simple if-else statements. It is also known as the conditional operator and uses the following syntax:
variable = (condition) ? value_if_true : value_if_false;
*/ 

//find maximum number from two numbers.

import java.util.Scanner;

public class ternary_operator {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number:");
        int f1 = n.nextInt();
        System.out.print("Enter first number:");
        int f2 = n.nextInt();
        int check = f1 > f2 ? f1 : f2;
        System.out.println("maximum number is:"+check);
    }
}
