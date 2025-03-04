/* Single inheritance in Java means a class inherits from only one parent class. In simple terms, a child class (subclass) extends a single parent class (superclass), inheriting its properties and methods.
The extends keyword is used to establish the inheritance relationship. 
The child class gets access to all public and protected members of the parent class. It cannot access private members directly.
The constructor of the parent class is called first (implicitly using super()).*/

public class single_inheritance1{
    protected String AccountHolderName;
    protected int Age;
    protected int AccountNumber;

    public single_inheritance1(String AccountHolderName, int AccountNumber, int Age) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.Age = Age;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}