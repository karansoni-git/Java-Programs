//switch statement to find month name from value 1 to 12.
import java.util.Scanner;

public class switch2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number to varify a month:");
        int month = n.nextInt();
         switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("june");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("Novermber");
            case 12 -> System.out.println("December");
            default -> System.out.println("enter a valid number");
        }
    }
}
