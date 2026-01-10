package Java_8_features;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (name) -> {
            System.out.println("hello i am " + name + " and i am consumer, i took my name");
        };
        consumer1.accept("karan");
        Consumer<String> consumer2 = (age) -> {
            System.out.println("I am " + age + " years old");
        };
        consumer2.accept("21");
    }
}

/*
=> What is Consumer? :
    -> Consumer<T> is a functional interface introduced in Java 8 that Takes one input and returns nothing (void)
    -> It is used when you want to consume an object and perform an action on it.
    -> Why Consumer Was Introduced?  :
        Before Java 8:
            Actions written inside loops
            Hard to reuse behavior
            No clean way to pass logic
        After Java 8:
            Behavior can be passed as a parameter
            Used heavily in Streams, forEach, logging, printing
*/
