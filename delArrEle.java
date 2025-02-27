
import java.util.Scanner;

public class delArrEle {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        //define size of an array
        System.out.print("Enter size of array: ");
        int size = n.nextInt();
        int[] oldarr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < oldarr.length; i++) {
            oldarr[i] = n.nextInt();
        }
        //enter number for deletion.
        System.out.print("Enter number that you want to delete: ");
        int del = n.nextInt();
        //finding element occurrence in array that we wwant to delete.
        int count = 0;
        for (int i = 0; i < oldarr.length; i++) {
            if (oldarr[i] == del) {
                count++;
            }
        }
        //define the size of new array 
        int[] newarr = new int[size - count];
        int i=0,j=0;
        while(i<oldarr.length)
        {
            if(oldarr[i] != del)
            {
                newarr[j] = oldarr[i];
                j++;
            }
            i++;
        }
        //printing new array
        System.out.println("new array:");
        for (int k = 0; k < newarr.length; k++) {
            System.out.println(newarr[k]);
        }
    }
}
