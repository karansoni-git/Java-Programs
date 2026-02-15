package DSA;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int sum = sumOfNum(5);
        System.out.println(sum);
    }

    public static int sumOfNum(int num) {
        if (num > 0) {
            return num + sumOfNum(num - 1);
        }
        return 0;
    }
}
