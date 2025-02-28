//simple calculator which perform various arithmetic operations on numbers.
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = n.nextInt();
        System.out.print("Enter second number:");
        int n2 = n.nextInt();
        System.out.print("whichoperation would you like do:");
        String op = n.next();
        switch (op) {
            case "+" ->
                System.out.println("Sum of " + n1 + " and " + n2 + " : " + (n1 + n2));
            case "-" ->
                System.out.println("Subtraction of " + n1 + " and " + n2 + " : " + (n1 - n2));
            case "*" ->
                System.out.println("Multiplication of " + n1 + " and " + n2 + " : " + (n1 * n2));
            case "/" ->
                System.out.println("Division of " + n1 + " and " + n2 + " : " + (n1 / n2));
            case "%" ->
                System.out.println("remainder of " + n1 + " and " + n2 + " : " + (n1 % n2));
        }
    }
}
