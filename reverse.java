public class reverse{
    public static void main(String[] args) {
        int n =987,r;
        while(n>0)
        {
            r = n % 10;
            System.out.print(r);
            n = n /10;
        }
    }
}