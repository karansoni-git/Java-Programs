package Java_8_features;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<String> details = (name,superHeroName)->{
            return "My Name Is " + name + " And I Am " + superHeroName  ;
        };
        String result = details.apply("Kal El" , "SuperMan");
        System.out.println(result);
    }
}
