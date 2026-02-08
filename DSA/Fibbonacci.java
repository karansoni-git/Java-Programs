package DSA;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibOfN(5));
    }

    public static int fibOfN(int n) {
        if (n <= 1) return 1;
        return fibOfN(n - 1) + fibOfN(n - 2);
    }
}
