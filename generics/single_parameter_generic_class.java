/*
=> Definition :
    -> Generics in Java allow you to write classes, interfaces, and methods with type parameters.
    -> This means you can create code that works with different data types while providing type safety at compile-time.
    -> Introduced in Java 5 (JDK 1.5)

=> Why Use Generics? :
   -> Type Safety – Prevents ClassCastException at runtime.
   -> Code Reusability – One class/method can work with different data types.
   -> Readability – No need for explicit typecasting.
   -> Performance – Reduces overhead of typecasting.
*/

package class_and_object.genrics;

public class single_parameter_generic_class <T>{

    private T var1;

    public single_parameter_generic_class(T initialVar1){
        this.var1 = initialVar1;
    }
    public T getVar1() {
        return var1;
    }

    public void changeVar1(T newVar1) {
        this.var1 = newVar1;
    }

    public static void main(String[] args) {
        single_parameter_generic_class<Integer> s1 = new single_parameter_generic_class<>(19);
        single_parameter_generic_class<String> s2 = new single_parameter_generic_class<>("Karan");
        System.out.println(s1.getVar1());
        s1.changeVar1(20);
        System.out.println(s2.getVar1());
    }
}
