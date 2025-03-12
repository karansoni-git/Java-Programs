public class throw_keyword{
    public static void check(int age)
    {
        if(age<18)
        {
            throw new IllegalArgumentException("can't drive a car");
        }
    }
    public static void main(String[] args) {
        try {
            check(17);
        } catch (IllegalArgumentException e) {
            System.out.println("error is : "+e.getMessage());
        }
    }
}