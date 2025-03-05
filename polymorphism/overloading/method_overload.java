/* method overloading is a feature that allows a class to have multiple methods with the same name but different parameter lists (type, number, or order of parameters). The compiler differentiates these methods based on their method signatures(type, number, or order of parameters) */
public class method_overload {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        method_overload m = new method_overload();
        //call first add method which has two integer parameter.
        System.out.println(m.add(10, 20));
        //call second add method which has three integer parameter.
        System.out.println(m.add(10, 20, 30));
        //call third add method which has two double type parameter.
        System.out.println(m.add(64.916, 56.679));
    }
}
