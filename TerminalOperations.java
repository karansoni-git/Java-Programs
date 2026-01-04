package Java_8_features.StreamDemos;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        stream1.forEach(x -> System.out.print(x + " "));

        System.out.println();

        Stream<Integer> stream2 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream2.reduce(Integer::sum).get());

        Stream<Integer> stream3 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream3.count());

        Stream<Integer> stream4 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream4.min((x, y) -> x - y).get());

        Stream<Integer> stream5 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream5.max((x, y) -> x - y).get());

        Stream<Integer> stream6 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream6.anyMatch(x -> x == 19));

        Stream<Integer> stream7 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream7.allMatch(x -> x > 0 && x < 100));

        Stream<Integer> stream8 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream8.noneMatch(x -> x > 100));

        Stream<Integer> stream9 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream9.filter(x -> x > 50).findAny().get());

        Stream<Integer> stream10 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream10.filter(x -> x > 50).sorted().findFirst().get());

        Stream<Integer> stream11 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        Object[] array = stream11.filter(x -> x > 50 && x < 80).toArray();
        for (Object o : array) {
            System.out.print(o + " ");
        }

        System.out.println();

        System.out.println("Collector class methods : ");

        // collecting to a list
        Stream<Integer> stream12 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream12.map(x -> x * 2).collect(Collectors.toList()));

        // collecting to a set
        Stream<Integer> stream13 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream13.filter(x -> x > 50).collect(Collectors.toSet()));

        // collecting to a specified collection
        Stream<Integer> stream14 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream14.collect(Collectors.toCollection(()->new TreeSet<>())));

        // joining strings , concatenates stream elements into a single stream
        Stream<String> stream15 = Stream.of("karan","purn","kushal","kirtan");
        System.out.println(stream15.collect(Collectors.joining(" - ")));

        // summarizing -> return intSummaryStatistics
        Stream<Integer> stream16 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        IntSummaryStatistics summary = stream16.collect(Collectors.summarizingInt(x -> x));
        System.out.println("min() : " + summary.getMin());
        System.out.println("max() : " + summary.getMax());
        System.out.println("average() : " + summary.getAverage());
        System.out.println("sum() : " + summary.getSum());
        System.out.println("count() : " + summary.getCount());

        // average
        Stream<Integer> stream17 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream17.collect(Collectors.averagingInt(x->x)));

        //
        Stream<Integer> stream18 = Stream.of(39, 19, 91, 37, 72, 89, 67, 52);
        System.out.println(stream18.collect(Collectors.summingInt(x->x)));

        List<String> words = Arrays.asList("ironman","spiderman","strange","hulk","thor","hawkeye","shazam","batman","flash","superman");
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.joining(" | "))));

        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 6)));
        System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));
    }
}
/*
=> What are Terminal Operations? :
    -> Terminal operations consume a stream and produce a result or side-effect.
    -> After a terminal operation, the stream is closed and cannot be reused.

    -> Key Properties :
        -> Trigger execution of pipeline
        -> End the stream
        -> Return result or perform action
        -> Stream becomes unusable

    -> CLASSIFICATION OF TERMINAL OPERATIONS :
        -> Iteration / Side-effect operations : forEach(Consumer<T>) , forEachOrdered(Consumer<T>) used with parallel stream
        -> Reduction operations : reduce() , count() , min() / max()
        -> Short-circuiting operations :
        -> Matching operations : anyMatch(Predicate<T>) , allMatch(Predicate<T>) , noneMatch(Predicate<T>)
        -> Finding operations : findFirst() , findAny()
        -> Collection operations : collect()
        Common Collectors : toList() | toSet() | toMap() | joining() | groupingBy() | partitioningBy() | counting()
        -> primitive stream terminal operation : sum() | average() | summaryStatistics() |
        -> array terminal operations : toArray()
        -> close terminal operations : close()

*/
