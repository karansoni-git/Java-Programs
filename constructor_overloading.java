/*Constructor overloading is a technique where a class has multiple constructors — each with a different parameter list. This allows you to create objects in different ways, giving flexibility in object initialization. */
public class constructor_overloading {

    public constructor_overloading() {
        System.out.println("first constructor");
        System.out.println("this is a constructor with no arguments.");
    }

    public constructor_overloading(int num) {
        System.out.println("second constructor");
        System.out.println("your guessed number is : " + num);
    }

    public constructor_overloading(String name) {
        System.out.println("third constructor");
        System.out.println("your name is " + name);
    }

    public constructor_overloading(String name, int age) {
        System.out.println("fourth constructor");
        System.out.println("your name is " + name  + " and age is " + age);
    }

    public static void main(String[] args) {
        constructor_overloading c1 = new constructor_overloading();
        constructor_overloading c2 = new constructor_overloading(823);
        constructor_overloading c3 = new constructor_overloading("sanjay");
        constructor_overloading c4 = new constructor_overloading("karan",20);
    }
}
