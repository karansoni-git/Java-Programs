
import java.util.Scanner;

public class switch_p {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number to check a day:");
        int a = n.nextInt();

        switch (a) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("enter a valid number");
        }

        //new way to write a switch statement.
        //  switch (a) {
        //     case 1 -> System.out.println("sunday");
        //     case 2 -> System.out.println("monday");
        //     case 3 -> System.out.println("tuesday");
        //     case 4 -> System.out.println("wednesday");
        //     case 5 -> System.out.println("thursday");
        //     case 6 -> System.out.println("friday");
        //     case 7 -> System.out.println("saturday");
        //     default -> System.out.println("enter a valid number");
        //     //also use for multiple case and single output
        //     // case 8,9 ->System.out.println("...");
        // }
        
        //this new switch can also return a value.
        //  String val = switch (a){
        //     case 1 -> "Day is:Sunday";
        //     case 2 -> "Day is:Monday";
        //     case 3 -> "Day is:Tuesday";
        //     case 4 -> "Day is:Wednesday";
        //     case 5 -> "Day is:Thursday";
        //     case 6 -> "Day is:Friday";
        //     case 7 -> "Day is:Saturday";
        //     default -> "enter a valid number";
        // };
        // System.out.println(val);
    }
}
