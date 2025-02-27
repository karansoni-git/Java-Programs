// public class prime{
//     public static void main(String[] args) {
//         int n = 23,c=0;
//         for(int i=1; i<=n; i++)
//         {
//             if(n % i == 0)
//             {
//                 c++;
//             }
//         }
//         if(c == 2)
//         {
//             System.out.println("number is prime");
//         }else{
//             System.out.println("number is not prime");
//         }
//     }
// }


//second method to find a number is prime or not.easy compare to other methods
public class prime {

    public static boolean check(int a) {
        int i = 2;
        while (i < a) {
            if (a % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean chk = check(6);
        if(chk)
        {
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
