//this program is check a correct password using do while loop 

import java.util.Scanner;

public class pwd_checker {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Set your password:");
        int pwd = n.nextInt();
        int check;
        int remain = 5;
        do {
            System.out.print("Enter your password:");
            check = n.nextInt();
            if (pwd != check) {
                System.out.println("wrong password,please enter correct password");
                remain--;
                if (remain <= 3) {
                    System.out.println("last " + remain + " attempt");
                    if (remain == 0) {
                        System.out.println("Phone locked, try after some times!");
                        break;
                    }
                }
            } else {
                System.out.println("Successfully open the lock");
            }
        } while (pwd != check);

    }
}
