public class BankSystemTest {
    public static void main(String[] args) {
        Bank bank = new Bank("SimpleBank");

        SavingsAccount account1 = new SavingsAccount("221", "Sherlock Holmes", 900.0, 0.02);
        CheckingAccount account2 = new CheckingAccount("222", "John Watson", 420.0, 300.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println("\n--- Deposit to Sherlock's Account ---");
        account1.deposit(420);

        System.out.println("\n--- Withdraw from John's Account ---");
        account2.withdraw(87);

        System.out.println("\n--- Update Account Holder ---");
        bank.updateAccount("221", "Sherlock Holmes");

        System.out.println("\n--- Remove John's Account ---");
        bank.removeAccount("222");

        System.out.println("\n--- Display Balance ---");
        System.out.println("John's balance: " + account1.getBalance());
    }
}
