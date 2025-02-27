
import java.util.Scanner;

// sum of numbers

public class p3{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number: ");
        a = x.nextInt();
        System.out.print("Enter the second number: ");
        b = x.nextInt();
        c=a+b;
        System.out.print("The sum of the two numbers is: " + c);
    }
}