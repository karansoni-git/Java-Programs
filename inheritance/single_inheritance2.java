public class single_inheritance2 extends single_inheritance1{

    public single_inheritance2(String AccountHolderName, int AccountNumber, int Age) {
    //Used to call a method from the parent class that is overridden in the child class.
        super(AccountHolderName, AccountNumber, Age);
    }

    public static void main(String[] args) {
        single_inheritance2 c1 = new single_inheritance2("karan soni",987456321,20);
        System.out.println(c1.getAccountHolderName());
        c1.setAccountHolderName("karan parekh");
        System.out.println(c1.getAccountHolderName());
    }
}