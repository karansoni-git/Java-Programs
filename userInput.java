
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner all = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String N = all.nextLine();
        System.out.println("Hello," + N + " Welcome to java world");
        System.out.print("Enter Your Age:");
        int A = all.nextInt();
        System.out.print("Are You Working(Ans. in true or false):");
        boolean isWorking = all.nextBoolean();
        System.out.println("You Are " + A + " Old And you have job? " + isWorking);
    }
}
