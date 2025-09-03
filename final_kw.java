/*
=> The final keyword in Java is a modifier that can be applied to variables, methods, and classes.

1. final with Variables (Constants)
    -> When a variable is declared as final, its value cannot be changed once initialized.
    -> A final variable must be initialized either:
        -> at the time of declaration, OR
        -> in the constructor (for instance variables), OR
        -> in an initializer block.
NOTE : -> If a final variable is primitive, its value cannot change.
       -> If it is a reference variable, the reference cannot change, but the object's internal state can change

2. final with Methods
    -> A final method cannot be overridden by subclasses.
    -> It is often used for security or design reasons when you want to prevent modification of method behavior.

3. final with Classes
    -> A final class cannot be inherited.
    -> Example: String class in Java is final.

4. final with Static Variables (Constants Convention)
    -> When combined with static, it is used to create constants.
    -> Naming convention: constants are written in UPPERCASE.
*/

public class final_kw {
    private static final String COLLEGE_NAME = "Christ College";
    private static int students = 0;
    private int rollno = 100;
    private String name;
    private int age;

    private final_kw(String name, int age) {
        this.name = name;
        this.age = age;
        students++;
        this.rollno += students;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private int getRollno() {
        return rollno;
    }

    private static int getStudents() {
        return students;
    }

    private void ChangeName(String newName) {
        this.name = newName;
    }

    private void ChangeAge(int newAge) {
        this.age = newAge;
    }

    private void ChangeRollno(int newRollno) {
        this.rollno = newRollno;
    }

    public final void details() {
        System.out.println("this is details page of student");
        System.out.printf("Student Name Is %s And his Roll no : %d , Student Of %s", this.name, this.rollno, final_kw.COLLEGE_NAME + "\n");
    }


    public static void main(String[] args) {
        final_kw s1 = new final_kw("karan", 20);
        final_kw s2 = new final_kw("kushal", 19);
        final_kw s3 = new final_kw("purn", 21);
        final_kw s4 = new final_kw("aayu", 24);
        final_kw s5 = new final_kw("krish", 22);
        s1.details();
        System.out.println("Name : " + s1.getName());
        System.out.println("Rollno : " + s1.getRollno());
        System.out.println("Age : " + s1.getAge());
        System.out.println();
        s3.details();
        System.out.println("Name : " + s3.getName());
        System.out.println("Rollno : " + s3.getRollno());
        System.out.println("Age : " + s3.getAge());
        System.out.println();
        System.out.println("Total Students In College : " + final_kw.getStudents());
        System.out.println();
        s2.details();
        System.out.println("Name : " + s2.getName());
        s2.ChangeName("dhruvil");
        System.out.println("\nAfter Name Updation");
        s2.details();
    }
}
