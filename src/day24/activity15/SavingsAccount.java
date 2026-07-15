
package day24.activity15;


public class SavingsAccount extends Account implements Transaction {
    
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("=== Savings Account Info ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%\n");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account.");
            System.out.println("New Balance: " + balance + "\n");
        } else {
            System.out.println("Deposit amount must be positive.\n");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
            System.out.println("New Balance: " + balance + "\n");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.\n");
        } else {
            System.out.println("Withdrawal amount must be positive.\n");
        }
    }
}