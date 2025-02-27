//sum of digits: ex 123  = 1 + 2 + 3 = 6
import java.util.Scanner;

public class sum_of_digit{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = n.nextInt();
        while (a > 0) {
            sum = sum + (a % 10);
            a /= 10;
        }  
        System.out.println("sum of digit is "+sum);
    }
}