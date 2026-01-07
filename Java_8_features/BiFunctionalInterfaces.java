package Java_8_features;

import javax.naming.BinaryRefAddr;
import java.util.function.*;

public class BiFunctionalInterfaces {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> (s1 + s2).length() >= 10;
        boolean isLengthGreaterThan10 = biPredicate1.test("karan", "parekh");
        System.out.println(isLengthGreaterThan10);

        BiPredicate<String, String> biPredicate2 = (s1, s2) -> {
            if (s1.contains("a") && s2.contains("i")) {
                return true;
            }
            return false;
        };
        System.out.println(biPredicate2.test("ram", "sita"));

        BiPredicate<String, String> biPredicate3 = biPredicate1.and(biPredicate2);
        System.out.println(biPredicate3.test("karan", "soniii"));

        BiPredicate<String, String> biPredicate4 = biPredicate1.or(biPredicate2);
        System.out.println(biPredicate4.test("karan", "son"));

        BiPredicate<String, String> negative = biPredicate1.negate();
        System.out.println(negative.test("karan", "soni"));

        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> a + b;
        System.out.println("Sum : " + biFunction1.apply(200, 300));

        BiFunction<Integer, Integer, Integer> biFunction2 = (a, b) -> a * b;

        Function<Integer, Integer> function = a -> a * a;

        BiFunction<Integer, Integer, Integer> biFunction3 = biFunction1.andThen(function);
        System.out.println(biFunction3.apply(10,10));

        BiConsumer<Integer,String> biConsumer1 = (age,name)->{
            System.out.println("My Name Is " + name + " And I Am " + age + " Years Old");
        };
        biConsumer1.accept(21,"Karan");
    }
}
/*
=> What are Bi-Functional Interfaces? :
    -> Bi-functional interfaces are functional interfaces that Accept TWO input arguments and may return a result or perform an action.
    List of All Bi-Functional Interfaces

    -> Java provides 3 main Bi-functional interfaces :
        -> BiPredicate<T, U>
        -> BiFunction<T, U, R>
        -> BiConsumer<T, U>
        Along with primitive specializations.

    1) BiPredicate<T, U>
        What is BiPredicate? :
        BiPredicate<T, U> : Takes two inputs and returns a boolean result
        Default Methods :
        | Method           | Description |
        | ---------------- | ----------- |
        | and(BiPredicate) | Logical AND |
        | or(BiPredicate)  | Logical OR  |
        | negate()         | Logical NOT |

    2) BiFunction<T, U, R>
        What is BiFunction?
        BiFunction<T, U, R>: Takes two inputs and returns one result

*/
