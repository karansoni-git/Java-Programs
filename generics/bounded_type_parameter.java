/*
=> In Java Generics, a bounded type parameter is when you place a restriction (or bound) on the types that can be passed as type arguments.
This means you don’t allow just any type, but only those that extend (inherit from) a specific class or implement an interface.
*/

package class_and_object.genrics;

public class bounded_type_parameter<N extends Number, V> { //here the first type should be integral type(int,float,byte,double,float,short) which extends Number class.
    private N val1;
    private V val2;

    public bounded_type_parameter(N intialVal1, V intialVal2) {
        this.val1 = intialVal1;
        this.val2 = intialVal2;
    }

    public N getVal1() {
        return val1;
    }

    public V getVal2() {
        return val2;
    }

    public static void main(String[] args) {
        bounded_type_parameter<Integer, String> s1 = new bounded_type_parameter<>(1001, "Karan");
        bounded_type_parameter<Float, String> s2 = new bounded_type_parameter<>(300000.034f, "Google");
//        bounded_type_parameter<String, String> s3 = new bounded_type_parameter<>("Google", "Banglore"); this will throw compile time error

        System.out.println("ID : " + s1.getVal1());
        System.out.println("NAME : " + s1.getVal2());
        System.out.println("SALARY : " + s2.getVal1());
        System.out.println("COMPANY : " + s2.getVal2());
    }
}
