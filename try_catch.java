
import java.util.Scanner;

public class try_catch {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = n.nextInt();
        System.out.print("Enter second number:");
        int b = n.nextInt();
        int div = 0;
        try {
            div = a / b;
            System.out.println("division:"+div);
        } catch (ArithmeticException e) {
            System.out.println("something error in program : " + e.getMessage());
        }
    }
}
