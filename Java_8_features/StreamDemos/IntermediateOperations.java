package Java_8_features.StreamDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437);
        List<Integer> list1 = stream1.filter(x -> x > 50 && x < 500).toList();
        System.out.println(list1);

        Stream<Integer> stream2 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437);
        List<Integer> list2 = stream2.map((x) -> x * 2).toList();
        System.out.println(list2);

        Stream<Integer> stream3 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437);
        List<Integer> list3 = stream3.sorted().toList();
        System.out.println(list3);

        Stream<Integer> stream4 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        List<Integer> list4 = stream4.distinct().toList();
        System.out.println(list4);

        Stream<Integer> stream5 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        List<Integer> list5 = stream5.skip(3).toList();
        System.out.println(list5);

        Stream<Integer> stream6 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        System.out.println(stream6.anyMatch(x -> x == 52));

        Stream<Integer> stream7 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        System.out.println(stream7.allMatch(x -> x > 10));

        Stream<Integer> stream8 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        System.out.println(stream8.noneMatch(x -> x > 1000));

        Stream<Integer> stream9 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        stream9.peek(x -> System.out.print(x + x + " ")).toList();

        System.out.println();

        Stream<Integer> stream10 = Stream.of(3, 52, 91, 74, 15, 849, 926, 783, 437, 3, 52);
        System.out.println(stream10.limit(5).toList());

        List<List<String>> names = Arrays.asList(
                Arrays.asList("karan", "dhruvil"), Arrays.asList("vedant", "krish"), Arrays.asList("vatshal", "tirth")
        );
        System.out.println(names
                .stream()
                .flatMap(arr -> arr.stream())
                .map(elem -> elem.toUpperCase())
                .toList());
    }
}
/*
=> What are Intermediate Operations? :
    -> Intermediate operations transform a stream into another stream.
    -> They are lazy, meaning they do not execute until a terminal operation is called.

    -> Key Properties :
            -> Return a Stream
            -> Can be chained
            -> Lazy evaluation
            -> Executed element-by-element
            -> Can be stateless or stateful

    -> CLASSIFICATION OF INTERMEDIATE OPERATIONS :
        -> Stateless Operations : Stateless operations do not depend on previous elements.
        -> Stateful Operations : Stateful operations need to remember elements.
        -> Short-Circuiting Operations : These operations can stop processing early.
*/
