//ticket discount program

import java.util.Scanner;

public class p5{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Ticket Counter");
        System.out.print("enter your age:");
        int age = i.nextInt();
        System.out.print("are you female(true/female):");
        boolean isfemale = i.nextBoolean();
        if(isfemale)
        {
            if(age < 5)
            {
                System.out.println("you got 75% discount");
            }
            else{
                System.out.println("you got 50% discount");
            }
        }else{
            if(age < 5)
            {
                System.out.println("you got 75% discount");
            }else{
                System.out.println("men's can't get discount");
            }
        }
    }
}