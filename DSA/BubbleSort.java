package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {93, 37, 61, 79, 12, 21};
        bubbleSort(array);
        System.out.print("Final Sorted Array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;

        System.out.print("Before Sorting Array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // n-1 => total length -1 because the first element get sorted automatically when all element get sorted.
        //first loop basically define how many iteration do we have to iterate. basically same as the length of the array - 1.
        for (int i = 0; i < n - 1; i++) {
            System.out.print("iteration " + i + " :\n");

            //each outer loop compare single array element with its further single element. that's how the max element reach at its right position in each iteration.
            // and the array being sorted from behind ,and we again compare element with each other except sorted elements. for that we decrease the inner loop size
            // so that it will not again compare with sorted elements.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(j + " ");
                System.out.print(" (" + array[j] + " > " + array[j + 1] + ") : ");
                boolean isGreater = array[j] > array[j + 1];
                System.out.print(isGreater + " --> ");


                if (array[j] > array[j + 1]) {
                    int tempVar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempVar;
                }


                for (int i1 : array) {
                    System.out.print(i1 + " ");
                }
                System.out.println();
            }

            System.out.println("After " + i + " iteration : ");
            for (int i1 : array) {
                System.out.print(i1 + " ");
            }
            System.out.println("\n");
        }
    }
}
