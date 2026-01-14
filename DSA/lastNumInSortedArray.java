package DSA;

public class lastNumInSortedArray {
    public static void main(String[] args) {
//        int[] array = {1, 3, 7, 15, 23, 34, 58, 78, 50};
//        int lastNum = array.length - 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[lastNum] < array[i]) {
//                int tempVar = array[lastNum];
//                array[lastNum] = array[i];
//                array[i] = tempVar;
//            }
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }


        int[] array = {2, 5, 6, 8, 9, 7};
        int n = array.length;
        int lastNum = array[n - 1];
        int swapIndex = n - 2;
        while (swapIndex >= 0 && lastNum < array[swapIndex]) {
            swapIndex--;
        }
        System.out.println(swapIndex);
        for (int i = n - 1; i >= swapIndex + 2; i--) {
            array[i] = array[i - 1];
//            System.out.print(array[i] + " ");
        }
        array[swapIndex + 1] = lastNum;
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
