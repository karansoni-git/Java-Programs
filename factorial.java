//factorial of given number

public class factorial{
    
    public static int f(int a)
    {
        if (a == 0) {
            return 1;
        }
        else{
            return a * f(a-1);
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int b = f(a);
        System.out.println("factorial of " + a + " : " + b);
    }
} 
