import java.util.Scanner;

public class armstrong{

    /*this function find the digits  of the numbers. reason for finding digits is to check any digits of number is armstrong or not.
    ex: 153 has a three digit and it is armstrong
    9474 has a four digits and it is armstrong.
    */
    static int count(int a)
    {
        int c=0;
        while(a > 0)
        {   
            a = a / 10;
            c++;
        }
        return c;
    }

    public static void arm(int a){
        int r,s=0,c;
        c = a;
        int n = count(a);
        while(a > 0){
            r = a % 10;
            s = ((int)Math.pow(r, n)) + s;
            a = a / 10;
        }
        if(c == s)
        {
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number to check it is armstrong or not : ");
        int a = n.nextInt();
        arm(a);
    }
}