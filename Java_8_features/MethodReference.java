package Java_8_features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
}
class democlass{

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        list.forEach(x -> System.out.println(x * 2)); // lambda expression
        list.forEach(System.out::println); // replace lambda expression with method reference.
        list.forEach(democlass::cube); //custom method reference.
    }

    public static void cube(int x){
        System.out.print(x * x * x + " ");
    }
}

