interface Loan {
    void applyLoan();
    double calculateInterest();
}

class HomeLoan implements Loan {
    private double principal;
    private double rate; // annual interest rate
    private int tenure; // years

    public HomeLoan(double principal, double rate, int tenure) {
        this.principal = principal;
        this.rate = rate;
        this.tenure = tenure;
    }

    @Override
    public void applyLoan() {
        System.out.println("Applying for Home Loan of amount: $" + principal);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * tenure) / 100;
    }
}

class CarLoan implements Loan {
    private double principal;
    private double rate;
    private int tenure;

    public CarLoan(double principal, double rate, int tenure) {
        this.principal = principal;
        this.rate = rate;
        this.tenure = tenure;
    }

    @Override
    public void applyLoan() {
        System.out.println("Applying for Car Loan of amount: $" + principal);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * tenure) / 100;
    }
}

public class LoanApp {
    public static void main(String[] args) {
        Loan homeLoan = new HomeLoan(250000, 7.5, 20);
        Loan carLoan = new CarLoan(35000, 8.5, 5);

        homeLoan.applyLoan();
        System.out.println("Home Loan Interest: $" + homeLoan.calculateInterest());

        System.out.println();

        carLoan.applyLoan();
        System.out.println("Car Loan Interest: $" + carLoan.calculateInterest());
    }
}
