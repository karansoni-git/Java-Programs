package Java_8_features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ironman", "spiderman", "strange", "hulk", "thor", "hawkeye", "shazam", "batman", "flash", "superman");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));

        String sentence = "hello world hello java world";
        String[] s = sentence.split(" ");
        Stream<String> arrayStream = Arrays.stream(s);
        System.out.println(arrayStream.collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(93, "Iphone");
        map.put(91, "Samsung");
        map.put(17, "Iqoo");
        map.put(47, "Realme");
        System.out.println(map.keySet().stream().reduce(Integer::sum).get());
        System.out.println(map.keySet().stream().collect(Collectors.summingInt(x -> x)));

        List<String> fruits = Arrays.asList("Apple", "banana", "pineapple");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
    }
}