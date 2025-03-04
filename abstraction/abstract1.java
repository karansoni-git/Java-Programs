/*this is an example of an abstarct class.

=>an abstract class is a class that is declared with the abstract keyword. It can have both abstract methods (methods without a body) and concrete methods (methods with a body). 
Abstract classes cannot be instantiated — they are meant to be extended by subclasses.
*/
public abstract class abstract1{
    protected int Age;
    protected String Name;
    protected int Salary;

    public abstract1(int Age, String Name, int Salary) {
        this.Age = Age;
        this.Name = Name;
        this.Salary = Salary;
    }

    /*an abstract method is a method that is declared without an implementation — meaning it has no body. It is defined using the abstract keyword and is meant to be overridden by subclasses.
    
    You can only declare abstract methods inside abstract classes or interfaces. */

    public abstract void detail(); 

    
}