/*The for-each loop in Java, also known as the enhanced for loop, is a simpler way to iterate over arrays or collections without using an index variable. It’s especially useful when you don’t need to keep track of the current position in the data structure.
syntax:
for (type variable : collection) {
     code to be executed
} */
public class forEach_loop{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}