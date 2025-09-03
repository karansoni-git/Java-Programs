import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        System.out.printf("Sum Of N Number From 1 To %d : %d",num,SumOfN(num));
    }

    public static int SumOfN(int num) {
        if (num == 1) {
            return 1;
        }
        return num + SumOfN(num - 1);
    }
}
