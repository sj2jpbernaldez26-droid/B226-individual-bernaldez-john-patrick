
package day24.activity15;


public class Main {
    
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount("SA-1009", "John", 2000.0, 3.5);
        savings.displayAccountInfo();
        savings.deposit(1500.0);
        savings.withdraw(500.0);

        CheckingAccount checking = new CheckingAccount("CA-1008", "Jiyo", 2000.0, 1000.0);
        checking.displayAccountInfo();
        checking.deposit(1000.0);
        checking.withdraw(3500.0);
    }
}