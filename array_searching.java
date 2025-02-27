
import java.util.Scanner;

public class array_searching {

    public static boolean search(int[] arr , int num)
    {
        int lgn = arr.length;
        for(int i=0; i<lgn; i++)
        {
            if(num == arr[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] arr = {10, 43, 64, 86, 58, 90, 93, 4, 68, 32};
        System.out.print("enter number to find in array : ");
        int find = n.nextInt();
        boolean result = search(arr, find);
        if(result)
        {
            System.out.println("your number is found");
        }else{
            System.out.println("your number is not found");
        }
    }
}
