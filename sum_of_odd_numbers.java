//sum of all odd number froom 1 to n number
import java.util.Scanner;

public class sum_of_odd_numbers{

    public static void sumOfOdd(int a){
         int s = 0;
        for(int i=1; i<=a; i++)
        {
            if(i % 2 != 0)
            {
                s = s + i;
            }
        }
        System.out.println("sum of 1 to " + a + " odd number : " + s);
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = n.nextInt();
        sumOfOdd(a);
    }
}