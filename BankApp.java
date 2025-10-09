// Custom Exception Class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// BankAccount class with withdrawal method
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Withdrawal denied.");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Main application
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC12345", 500);

        try {
            System.out.println("Attempting to withdraw $300...");
            account.withdraw(300);

            System.out.println("Attempting to withdraw $250...");
            account.withdraw(250); // This will throw exception
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed. Current balance: $" + account.getBalance());
        }
    }
}
