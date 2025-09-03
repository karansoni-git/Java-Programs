/*
=> The static keyword in Java is one of the most important modifiers that changes the way variables, methods, blocks, and nested classes behave.
1. Static Variables (Class Variables)
    -> Declared using static inside a class but outside any method.
    -> Belongs to the class, not to objects (only one copy exists, shared by all objects).
    -> Used for common properties of all objects.

2. Static Methods
    -> Belong to the class, not objects.
    -> Can be called without creating an object.
    -> Cannot use this or super (because they belong to objects).
    -> Can only access static data directly.

3. Static Blocks
    -> Used to initialize static variables.
    -> Runs once when the class is loaded into memory.
    -> Executes before the main() method.

4. Static Classes (Nested Classes)
    -> A nested class can be made static.
    -> A static nested class does not need a reference of outer class.
    -> Can access only static members of outer class.
*/


public class static_kw {
    private static int totalStudent;//static variable
    private String name;
    private int age;

    //static block
    static {
        totalStudent = 0;
        System.out.println("Hello I'm static block");
        System.out.println("static block executed");
    }

    private static_kw(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudent++;
    }

    //static method
    public static int getTotalStudent() {
        return totalStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("Before creating oobjects : " + static_kw.getTotalStudent());
        static_kw s1 = new static_kw("karan", 20);
        static_kw s2 = new static_kw("kirtan", 17);
        static_kw s3 = new static_kw("kushal", 14);
        static_kw s4 = new static_kw("purn", 18);
        static_kw s5 = new static_kw("aayu", 13);
        System.out.println("After creating objects : " + static_kw.getTotalStudent());
    }
}
