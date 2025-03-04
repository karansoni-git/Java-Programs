public class abstract2 extends abstract1{   

    public abstract2(int Age, String Name, int Salary) {
        super(Age, Name, Salary);
    }

    @Override
    public void detail() {
       System.out.println("my name is " + Name + " and my age is " + Age + " my salary is "+ Salary);
    }

    public static void main(String[] args) {
        abstract2 a1 = new abstract2(20,"karan parekh",200000);
        a1.detail();
    }
}