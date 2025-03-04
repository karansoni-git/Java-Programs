
public class Bank {

    private String accountHolderName;

    private long accountNumer;

    private double balance;

    public Bank(String accountHolderName, long accountNumer, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumer = accountNumer;
        this.balance = balance;
    }

    public void deposit(double add) {
        if (add <= 0) {
            System.out.println("Enter valid amout for deposit money");
        } else {
            balance += add;
            System.out.println("successfully deposit " + add);
        }
    }

    public void withdraw(double wd) {
        if (balance <= 0 || wd > balance) {
            System.out.println("unsufficient money can't withdraw money");
        } else if (wd <= 0) {
            System.out.println("Enter valid amout for withdraw money");
        } else {
            balance -= wd;
            System.out.println("successfully withdraw " + wd);
        }
    }

    public void checkBalance() {
        System.out.println("Your account balance : " + balance);
    }

    public static void main(String[] args) {
        Bank c1 = new Bank("Karan parekh", 123456789, 150000);
        c1.checkBalance();
        c1.deposit(10000);
        c1.checkBalance();
        c1.withdraw(60000);
        c1.checkBalance();
    }
}
