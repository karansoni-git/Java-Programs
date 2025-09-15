/*
=> What is a Generic Constructor?
    -> A generic constructor is a constructor that has its own type parameters, independent of the class's type parameters.

=> Key Points :
1. A generic constructor can exist in both generic and non-generic classes.
2. Type parameter of the constructor is independent of the class’s type parameter.
3. Useful when you want flexibility in constructor arguments.
*/

package class_and_object.genrics;

public class generic_constructor {

    public<T> generic_constructor(T initialVal) {
        System.out.println("Initial Value : " + initialVal);
    }

    public static void main(String[] args) {
        generic_constructor g1 = new generic_constructor("Karan");
        generic_constructor g2 = new generic_constructor(20);
        generic_constructor g3 = new generic_constructor("Google");
    }
}
