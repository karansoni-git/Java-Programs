package Java_8_features.StreamDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // 1) creating stream from Collection.
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(41);
        list.add(68);
        list.add(92);
        list.add(82);
        System.out.println(list);
        /* here list is source creating stream from collection.
           stream() is method inside Collection interface used to convert collection object into stream
           filter() is intermediate operation used work on data. this will not generate final data until any terminal operation called like count() or more.
           this returns a Stream object.
           this type of behavior called lazy evaluation. this is very important concept in stream
        */
        Stream<Integer> collectionStream = list.stream().filter(x -> x > 40 && x < 70);
        long count = collectionStream.count();
        System.out.println("count() : " + count);
        // once the stream is used then it can not be reusable we have to generate new stream for different use.

        // 2) creating stream from an array
        String[] names = {"Karan", "Vedant", "Dhruvil", "Krish"};
        Stream<String> arrayStream = Arrays.stream(names);
        List<String> startWithk = arrayStream.filter(name -> name.toLowerCase().startsWith("k")).toList();
        System.out.println(startWithk);

        // 3) creating stream using Stream.of()
        Stream<Integer> streamOf = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> streamOfList = streamOf.map(x -> x * x).toList();
        System.out.println(streamOfList);

        // 4) creating empty stream using Stream.empty()
        Stream<String> empty = Stream.empty();
        List<String> list1 = empty.toList(); // coverting stream to list and storing.
        System.out.println("list : " + list1);

        // 5) creating infinite stream
//        Stream<Integer> generate = Stream.generate(()-> 16); // this will generate 16 infinite time.
        List<Integer> generateStream = Stream.generate(() -> 16).limit(20).toList();// this will generate 16 number 20 times. outof heap memory exception without limit()
        System.out.println(generateStream);

        // 6) creating infinite loop using Stream.iterate() method.
        List<Integer> StreamIterate = Stream.iterate(1, x -> x * 2).limit(10).toList(); // out of heap memory exception without limit()
        System.out.println("Sample : " + StreamIterate);
    }
}
/*
=> What is a Stream in Java? :
    -> A Stream is a sequence of elements from a data source that supports functional-style operations to process data without modifying the source.
    -> Introduced in Java 8
    -> Part of java.util.stream
    -> Works on Collections, Arrays, I/O, Generators
    -> Key Characteristics of Streams
        |         Feature         |             Description              |
        | ----------------------- | ------------------------------------ |
        |    No storage           | Streams don’t store data             |
        |    Functional           | Uses lambdas                         |
        |    Lazy                 | Operations run only at terminal step |
        |    One-time use         | Cannot reuse                         |
        |    Non-mutating         | Source unchanged                     |
        |    Supports parallelism | Built-in                             |

    -> Stream Pipeline (INTERNAL WORKING) :
        -> A stream pipeline has 3 stages:
            SOURCE → INTERMEDIATE OPERATIONS → TERMINAL OPERATIONS

    -> Stream Types :
        Object Stream : Stream<T>
        Primitive Streams (Performance Boost 🚀) :
            | Stream       | Purpose |
            | ------------ | ------- |
            | IntStream    | int     |
            | LongStream   | long    |
            | DoubleStream | double  |
            -> Avoid boxing/unboxing
            -> Faster & memory-efficient
*/