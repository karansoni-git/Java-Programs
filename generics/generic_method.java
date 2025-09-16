/*
=> Generic Method in Java
    -> A generic method is a method that can work with different data types without rewriting the code.
    -> it defines type parameters inside <> (angle brackets), which act as placeholders for actual data types when the method is called.
=> syntax :
    accessModifier <T> returnType methodName(T value) {...}
 */

package class_and_object.genrics;

public class generic_method {

    public static <T> void printArray(T[] arr){
        for(T ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        String[] strArr = {"Karan","Soni"};
        printArray(intArr);
        printArray(strArr);
    }
}
