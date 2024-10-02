import java.util.Scanner;

public class BankSystemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("SimpleBank");
        
        while (true) { 
            System.out.println("------------------------------------------------------------------------------------------");
            String multiLineString = String.join("\n", 
                                    
".______        ___      .__   __.  __  ___    .___  ___.  _______ .__   __.  __    __  \r\n" + //
        "|   _  \\      /   \\     |  \\ |  | |  |/  /    |   \\/   | |   ____||  \\ |  | |  |  |  | \r\n" + //
        "|  |_)  |    /  ^  \\    |   \\|  | |  '  /     |  \\  /  | |  |__   |   \\|  | |  |  |  | \r\n" + //
        "|   _  <    /  /_\\  \\   |  . `  | |    <      |  |\\/|  | |   __|  |  . `  | |  |  |  | \r\n" + //
        "|  |_)  |  /  _____  \\  |  |\\   | |  .  \\     |  |  |  | |  |____ |  |\\   | |  `--'  | \r\n" + //
        "|______/  /__/     \\__\\ |__| \\__| |__|\\__\\    |__|  |__| |_______||__| \\__|  \\______/  \r\n" + //
        "                                                                                        "
            );
            System.out.println(multiLineString);
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Choose an option: ");
            System.out.println("1. Add Savings Account");
            System.out.println("2. Add Checking Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Update Account Holder");
            System.out.println("6. Remove Account");
            System.out.println("7. Check Balance");
            System.out.println("8. Exit");
            System.out.println("------------------------------------------------------------------------------------------");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 8) {
                System.out.println("Goodbye!");
                break; 
            }

            
            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    String savingsAccNum = scanner.nextLine();
                    System.out.print("Account Holder: ");
                    String savingsHolder = scanner.nextLine();
                    System.out.print("Initial Balance: ");
                    double savingsBalance = scanner.nextDouble();
                    System.out.print("Interest Rate: ");
                    double interestRate = scanner.nextDouble();
                    bank.addAccount(new SavingsAccount(savingsAccNum, savingsHolder, savingsBalance, interestRate));
                    break;

                case 2: 
                    System.out.print("Account Number: ");
                    String checkingAccNum = scanner.nextLine();
                    System.out.print("Account Holder: ");
                    String checkingHolder = scanner.nextLine();
                    System.out.print("Initial Balance: ");
                    double checkingBalance = scanner.nextDouble();
                    System.out.print("Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    bank.addAccount(new CheckingAccount(checkingAccNum, checkingHolder, checkingBalance, overdraftLimit));
                    break;

                case 3: 
                    System.out.print("Account Number: ");
                    String depositAccNum = scanner.nextLine();
                    BankAccount depositAcc = bank.findAccount(depositAccNum);
                    if (depositAcc != null) {
                        System.out.print("Amount to Deposit: ");
                        double amount = scanner.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4: 
                    System.out.print("Account Number: ");
                    String withdrawAccNum = scanner.nextLine();
                    BankAccount withdrawAcc = bank.findAccount(withdrawAccNum);
                    if (withdrawAcc != null) {
                        System.out.print("Amount to Withdraw: ");
                        double amount = scanner.nextDouble();
                        withdrawAcc.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5: 
                    System.out.print("Account Number: ");
                    String updateAccNum = scanner.nextLine();
                    System.out.print("New Account Holder Name: ");
                    String newHolder = scanner.nextLine();
                    bank.updateAccount(updateAccNum, newHolder);
                    break;

                case 6: // Remove Account
                    System.out.print("Account Number to Remove: ");
                    String removeAccNum = scanner.nextLine();
                    bank.removeAccount(removeAccNum);
                    break;

                case 7:
                    System.out.print("Account Number: ");
                    String balanceAccNum = scanner.nextLine();
                    BankAccount balanceAcc = bank.findAccount(balanceAccNum);
                    if (balanceAcc != null) {
                        System.out.println("Current Balance: " + balanceAcc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); 
    }
}
