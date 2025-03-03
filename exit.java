
import java.util.Scanner;

public class exit {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a String:");
            String str = n.next();
            //object never compare with == sign because object compae each other with their reference.
            //if(str == "exit") --> wrong
            
            //objects value can be compared with equals() method
            if(str.equals("exit")) 
            {
                break;
            }
        }
        System.out.println("successfully exited a program");
    }
}
