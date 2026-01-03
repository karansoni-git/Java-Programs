package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("11");
        test.add("22");
        test.add("33");
        test.add("11");
        System.out.println(test.get(3));
    }
}
