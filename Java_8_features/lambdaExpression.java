package Java_8_features;

public class lambdaExpression /*implements MathOperation*/ {

    //    @Override
//    public void operation(int a, int b) {
//        System.out.println(a + b);
//    }
    public static void main(String[] args) {
//        lambdaExpression obj1 = new lambdaExpression();
//        obj1.operation(10,20);

        // interface object reference.
        MathOperation sumOperation = (int a, int b) -> {
            System.out.printf("Sum Of %d And %d = %d\n", a, b, a + b);
        }; // definition of operation() function of MathOperation interface.
        sumOperation.operation(10, 20);

        MathOperation subOperation = (a, b) -> {
            System.out.printf("Subtraction Of %d And %d = %d\n", a, b, a - b);
        };
        subOperation.operation(83, 31);
    }

}

@FunctionalInterface
interface MathOperation {
    public abstract void operation(int a, int b);
}

/*
=> What is a Lambda Expression? :
    -> A Lambda Expression is an anonymous function :
        -> No name
        -> No return type (inferred)
        -> Can be passed as an argument
        -> Used to implement Functional Interfaces

    -> Lambda expression lets you write behavior (code) as data.
    -> Why Lambda Expressions Were Introduced? :
        -> Before Java 8:
            -> Java was verbose
            -> Too much boilerplate code
            -> Anonymous classes were lengthy
*/