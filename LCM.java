/*LCM (Least Common Multiple)
=>The smallest number that is a multiple of two or more given numbers.

Example: LCM of 4 and 6

Multiples of 4: 4, 8, 12, 16, 20, ...
Multiples of 6: 6, 12, 18, 24, ...
Smallest Common Multiple = 12 ✅
 */

import java.util.Scanner;
    
public class LCM{
    static void findlcm(int a,int b)
    {
        int lcm = Math.max(a, b); //finding max number among them
        while(true)
        {
            if(lcm % a ==0 && lcm % b == 0)
            {
                System.out.println("LCM : " + lcm);
                break;
            }
            lcm++;
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = n.nextInt();
        System.out.print("Enter second number: ");
        int b = n.nextInt();
        findlcm(a, b);
    }
}


//second approch to find a LCM of two numbers.
    // static int find_lcm(int a,int b)
    // {
    //     int i = 1;
    //     while(true)
    //     {
    //         int factor = a * 1;
    //         if(factor % b == 0)
    //         {
    //             return factor;
    //         }
    //         i++;
    //     }
    // }