package Java_8_features;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> p1 = (String name) -> {
            if (name.toLowerCase().startsWith("k")) {
                return true;
            }
            return false;
        };

        boolean isStartwithk = p1.test("karan");
        System.out.println("Is Start with k : " + isStartwithk);

        Predicate<String> p2 = (String name) -> {
            if (name.toLowerCase().endsWith("n")) {
                return true;
            }
            return false;
        };

        boolean isEndWithn = p2.test("karam");
        System.out.println("Is End With n : " + isEndWithn);

        Predicate<String> finalCheck = p1.and(p2);
        System.out.println(finalCheck.test("kaan"));
    }

}

/*
=> What is Predicate? :
    -> Predicate<T> is a functional interface introduced in Java 8 that:
    -> Takes one argument and returns a boolean value
    -> Why Predicate Was Introduced? :
        Before Java 8:
            -> Conditions written using loops & if-else
            -> Hard to reuse logic
            -> Not composable

        After Java 8:
            -> Conditions as functions
            -> Reusable & composable
            -> Used heavily in Streams API

    -> Abstract Method of Predicate
        test(T  t) :
            -> Only abstract method Must be implemented using lambda
*/