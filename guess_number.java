
import java.util.Scanner;

public class guess_number{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("guess any number:");
        int guess = n.nextInt();
        do { 
            System.out.print("guess again! =>");
            guess = n.nextInt();
        } while (guess != 195);
        System.out.println("ohh you guessed right number");
    }
}