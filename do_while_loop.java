//do-while loop is a type of loop that will always execute its body at least once, then check the condition to decide whether to repeat the loop or exit.

import java.util.Scanner;

public class do_while_loop {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a;
        do {
            System.out.print("Enter your age:");
            a = n.nextInt();
        } while (a < 18);
        System.out.println("now you are eligible for driving");
    }
}
