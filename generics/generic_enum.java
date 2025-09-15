package class_and_object.genrics;

enum Operation {
    ADD, MUL, DIV, SUB, MOD;

    public <T extends Number> double doIt(T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUB:
                return a.doubleValue() - b.doubleValue();
            case MUL:
                return a.doubleValue() * b.doubleValue();
            case DIV:
                return a.doubleValue() / b.doubleValue();
            case MOD:
                return a.doubleValue() % b.doubleValue();
            default:
                throw new AssertionError("enter valid operation");
        }

    }
}

public class generic_enum {
    public static void main(String[] args) {
        double res1 = Operation.ADD.doIt(12, 8);
        System.out.println("Addition :  " + res1);
        double res2 = Operation.SUB.doIt(12, 8);
        System.out.println("Subtraction :  " + res2);
        double res3 = Operation.MUL.doIt(12, 8);
        System.out.println("Multiplication :  " + res3);
        double res4 = Operation.DIV.doIt(12, 8);
        System.out.println("Division :  " + res4);
        double res5 = Operation.MOD.doIt(12, 8);
        System.out.println("Modulus :  " + res5);
    }
}
