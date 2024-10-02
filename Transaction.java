public class Transaction {
    int transactionId;
    BankAccount account;
    double amount;
    String transactionType;

    public Transaction(int transactionId, BankAccount account, double amount, String transactionType) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + transactionType);
    }
}
