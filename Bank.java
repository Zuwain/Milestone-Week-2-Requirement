import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added: " + account.accountNumber);
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber.equals(accountNumber)) {
                accounts.remove(i);
                System.out.println("Account removed: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void updateAccount(String accountNumber, String newHolder) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.updateAccountHolder(newHolder);
        }
    }
}
