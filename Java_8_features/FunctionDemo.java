package Java_8_features;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (a) -> a * 2;
        Function<Integer, Integer> f2 = (a) -> a * 3;
        System.out.println(f1.apply(30));
        System.out.println(f2.apply(200));
        Function<Integer,Integer> f3= f1.andThen(f2);
        System.out.println(f3.apply(12));
        Function<Integer,Integer> f4= f1.compose(f2);
        System.out.println(f4.apply(12));
        Function<String,String> identity = Function.identity();
        System.out.println(identity.apply("karan"));
    }
}

/*
=> What is Function? :
    -> Function<T, R> is a functional interface introduced in Java 8 that:
    -> Takes one input of type T and returns a result of type R

    -> Why Function Was Introduced? :
        ->Before Java 8:
            ->Logic mixed with loops
            ->No reusable transformation functions
            ->Verbose code

    -> After Java 8 :
            -> Transformation as first-class function
            -> Used heavily in Streams API
            -> Clean and composable logic

    -> Abstract Method of Function :
        -> R apply(T t)
        -> Only abstract method
        -> Implements transformation logic

    -> Default Methods of Function :
        Function provides 2 default methods for function composition.

        -> andThen() :
            default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
            First current function → then after
            Execution order: this → after
        -> compose() :
            default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
            First before → then current function
            Execution order: before → this
*/