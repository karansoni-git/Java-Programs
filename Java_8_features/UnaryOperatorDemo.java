package Java_8_features;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> power =(num)->{
            return num * num;
        };
        int number = 12;
        int result = power.apply(number);
        System.out.println("Power of " + number + " is " + result);
    }
}
