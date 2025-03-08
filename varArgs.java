/* variable arguments (varargs) allow you to pass a variable number of arguments to a method. This is useful when you don’t know how many arguments will be passed to the method.
=>The ... (three dots) is called the ellipsis and indicates a varargs parameter.
=>Internally, varargs are treated as an array. 

Rules for using varargs:
=>A method can have only one varargs parameter.
=>Varargs must be the last parameter in the method signature.*/

public class varArgs {
 
    public static void add(int... x) {
        int sum = 0;
        for (int S : x) {
            sum += S;
        }
        System.out.println("sum : " + sum);
    }

    public static void main(String[] args) {
        add(5, 8, 2);
        add(3, 7);
    }

}
