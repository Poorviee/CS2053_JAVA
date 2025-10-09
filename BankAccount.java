abstract class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }

    void addInterest() {
        balance += balance * interestRate;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SA123", 1000, 0.04);

        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).addInterest();  // This line should work fine
        }
        
        acc1.displayBalance();
    }
}
