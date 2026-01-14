package DSA;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 54, 67, 83, 52, 41};
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
//            System.out.println("min : " + array[min]);
            //swaping
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        System.out.print("Sorted Array : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
