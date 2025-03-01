//while loop is used to repeatedly execute a block of code as long as a given condition is true.
public class while_loop {

    public static void main(String[] args) {
        int a = 0;
        int sum=0;
        //this loop is execute until sum get 50.
        while(sum < 50)
        {
            a+=5;
            sum += a;
            System.out.println(sum);
        }
    }
}
