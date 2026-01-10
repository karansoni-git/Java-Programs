package Java_8_features;

import java.sql.Date;
import java.sql.Time;

public class FunctionalInterfaceDemo implements sample {

    @Override
    public void greeting() {
        System.out.println("Good Night");
    }

    public static void main(String[] args) {

        sample obj1 = () -> {
            System.out.println("Good Morning");
        };
        obj1.greeting();
        obj1.time();

        sample obj2 = new FunctionalInterfaceDemo();
        obj2.greeting();
    }
}

@FunctionalInterface
interface sample {
    public abstract void greeting();

    default void time() {
        Time s = new Time(12, 15, 30);
        System.out.println(s);
    }
}

/*
-> What is a Functional Interface? :
    -> A Functional Interface is an interface that has:
    -> Exactly ONE abstract method

    -> It can have:
        -> Any number of default methods
        -> Any number of static methods
        -> Object class methods (toString, equals, hashCode)

    -> A functional interface is an interface with a single abstract method, used mainly to support lambda expressions and functional programming in Java.

    -> Why Functional Interfaces Were Introduced? :
        -> Introduced in Java 8 to support :
            -> Lambda Expressions
            -> Functional Programming
            -> Stream API
            -> Clean & concise code
            -> Before Java 8 → verbose anonymous classes
            -> After Java 8 → lambda-based behavior passing

    -> @FunctionalInterface Annotation :
        -> What does it do? :
            -> Ensures only ONE abstract method
            -> Compile-time safety
            -> Optional but recommended

    -> Abstract Method Rule (IMPORTANT) :
        -> A functional interface: Must have exactly one abstract method , Methods from Object class do NOT count

    -> Java 8 allows default methods. Default methods do not affect functional interface rule
    -> Static methods also allowed
*/