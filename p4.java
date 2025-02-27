//jumping statements
public class p4{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            //break the loop when i reach 5.
            if(i == 5)
            {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("Odd numbers:");
        for(int i=1; i<=10; i++)
        {
            //skips all number that is divided by 2.
            if(i % 2 == 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}