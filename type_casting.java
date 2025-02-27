public class type_casting{
    public static void main(String[] args) {

        //autimatically type casting also called Widening Casting 
        int a = 10;
        double b = a;
        System.out.println(b);


        //manually cahnging data type but it causes a data lose also called Narrowing Casting
        double c = 38.328928938d;
        int d = (int) c;
        System.out.println(d);
    }
}