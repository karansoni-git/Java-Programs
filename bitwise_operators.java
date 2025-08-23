/*
=> What are Bitwise Operators?
-> Bitwise operators in Java are used to perform operations on individual bits of integral data types (byte, short, int, long, and char).
They work at the binary (bit) level rather than the arithmetic value.
*/

import org.w3c.dom.TypeInfo;

import java.lang.reflect.Type;
import java.util.concurrent.RunnableScheduledFuture;

public class bitwise_operators {
    public static void main(String[] args) {

//        1. AND (&)
//        Compares each bit of two numbers.
//        Result is 1 if both bits are 1, otherwise 0.
        int and = 5 & 4; // 101 & 100 = 100 : 4
        System.out.println("AND Bitwise Operator");
        System.out.println(Integer.toBinaryString(5) + " : " + 5);
        System.out.println(Integer.toBinaryString(4) + " : " + 4);
        System.out.println("___");
        System.out.println(Integer.toBinaryString(and) + " : " + and);

//        2. OR (|)
//        Compares each bit of two numbers.
//        Result is 1 if any one of the bits is 1.
        int or = 5 | 7;
        System.out.println("\nOR Bitwise Operator");
        System.out.println(Integer.toBinaryString(5) + " : " + 5);
        System.out.println(Integer.toBinaryString(7) + " : " + 7);
        System.out.println("___");
        System.out.println(Integer.toBinaryString(or) + " : " + or);

//        3. XOR (^)
//        Compares each bit of two numbers.
//        Result is 1 if bits are different, otherwise 0.
        int xor = 5 ^ 7;
        System.out.println("\nXOR Bitwise Operator");
        System.out.println(Integer.toBinaryString(5) + " : " + 5);
        System.out.println(Integer.toBinaryString(7) + " : " + 7);
        System.out.println("___");
        System.out.println(" " + Integer.toBinaryString(xor) + " : " + xor);

//        4. NOT (~)
//        Unary operator (works on a single number).
//        Flips every bit: 0 → 1 and 1 → 0.
        int not = ~5;
        System.out.println("\nNOT Bitwise Operator");
        System.out.println(Integer.toBinaryString(5) + " : " + 5);
        System.out.println("___");
        System.out.println(Integer.toBinaryString(not) + " : " + not);

//        5. Left Shift (<<)
//        Shifts bits to the left.
//        Each left shift = multiply by 2.
        int leftshift = 5 << 1;
        System.out.println("\nLEFT SHIFT Bitwise Operator");
        System.out.println(" " + Integer.toBinaryString(5) + " : " + 5);
        System.out.println(Integer.toBinaryString(leftshift) + " : " + leftshift);

//        6. Right Shift (>>)
//        Shifts bits to the right.
//        Each right shift = divide by 2.
//        Preserves sign bit (keeps negative numbers negative).
        int rightshift = 5 >> 1;
        System.out.println("\nRIGHT SHIFT Bitwise Operator");
        System.out.println(Integer.toBinaryString(5) + " : " + 5);
        System.out.println(" " + Integer.toBinaryString(rightshift) + " : " + rightshift);

//        7. Unsigned Right Shift (>>>)
//        Shifts bits to the right.
//        Fills leftmost bits with 0 (ignores sign).
//        Useful for treating negative numbers as large positives.
        int unsignedrightshift = -20 >>> 2;
        System.out.println("\nUNSIGNED RIGHT SHIFT Bitwise Operator");
        System.out.println(Integer.toBinaryString(-20) + " : " + -20);
        System.out.println("  " + Integer.toBinaryString(unsignedrightshift) + " : " + unsignedrightshift);
    }
}
