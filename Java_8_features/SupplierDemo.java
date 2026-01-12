package Java_8_features;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Karan";
        String name = supplier.get();
        System.out.println("Hello My Name Is " +  name);
    }
}
/*
=> What is Supplier? :
    -> Supplier<T> is a functional interface introduced in Java 8 that Takes NO input and returns a value
    -> It is used when you want to supply or generate data without any arguments.

    -> Why Supplier Was Introduced? :
        Before Java 8:
            Factory logic hard-coded
            Object creation scattered
            Poor reusability
        After Java 8:
            Deferred execution
            Lazy value generation
            Clean factory patterns

    -> No default methods
    -> No static methods
*/
