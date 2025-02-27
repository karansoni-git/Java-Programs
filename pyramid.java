public class pyramid{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*class kite_pyramid {
    public static void main(String[] args) {
        int r = 1;
        while(r <= 5)
        {
            int c = 1;
            while(c <= r)
            {
                System.out.print("* ");
                c++;
            }
            r++;
            System.out.println();
        }
    }
}*/