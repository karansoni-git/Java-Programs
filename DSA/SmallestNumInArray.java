package DSA;

public class SmallestNumInArray {
    public static void main(String[] args) {
        int[] array = {83, 91, 62, 58, 73, 99, 152, 2};
        int minNum = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < minNum) minNum = i;
        }
        System.out.println("Minimun Number In Array : " + minNum);
    }
}
