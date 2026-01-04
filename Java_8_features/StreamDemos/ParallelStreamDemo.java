package Java_8_features.StreamDemos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("result of list with parallel stream using forEach : ");
        list.parallelStream().forEach(x -> System.out.print(x + " "));

        System.out.println();

        System.out.print("result of list with parallel stream using forEachOrdered : ");
        list.parallelStream().forEachOrdered(x -> System.out.print(x + " "));

    }
}

/*
=> What is a Parallel Stream? :
    -> A Parallel Stream is a stream that processes elements concurrently using multiple threads, automatically utilizing multiple CPU cores.
    -> Introduced in Java 8
    -> Part of java.util.stream
    -> Built on ForkJoinPool

*/