public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance = balance - amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void updateAccountHolder(String newHolder) {
        this.accountHolder = newHolder;
        System.out.println("Account holder updated to " + newHolder);
    }
}
