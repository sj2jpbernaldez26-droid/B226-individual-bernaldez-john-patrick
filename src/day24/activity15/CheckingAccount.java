
package day24.activity15;


public class CheckingAccount extends Account implements Transaction {
    
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("=== Checking Account Info ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit + "\n");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Checking Account.");
            System.out.println("New Balance: " + balance + "\n");
        } else {
            System.out.println("Deposit amount must be positive.\n");
        }
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = -overdraftLimit;
        if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
            if (balance < 0) {
                System.out.println("Withdrew " + amount + " from Checking Account.");
                System.out.println("Transaction allowed using overdraft.");
            } else {
                System.out.println("Withdrew " + amount + " from Checking Account.");
            }
            System.out.println("New Balance: " + balance + "\n");
        } else if ((balance - amount) < minBalance) {
            System.out.println("Exceeds overdraft limit.\n");
        } else {
            System.out.println("Withdrawal amount must be positive.\n");
        }
    }
}