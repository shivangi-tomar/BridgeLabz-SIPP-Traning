// Interface for Loanable accounts
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }
}

// SavingsAccount - implements Loanable
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Applied for Personal Loan (Savings Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// CurrentAccount - implements Loanable
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current account
    }

    @Override
    public void applyForLoan() {
        System.out.println("Applied for Business Loan (Current Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "Alice", 6000);
        BankAccount acc2 = new CurrentAccount(102, "Bob", 12000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            account.deposit(1000);
            account.withdraw(500);
            System.out.println("Interest Earned: " + account.calculateInterest());

            Loanable loan = (Loanable) account;
            loan.applyForLoan();
            System.out.println("Loan Eligibility: " + (loan.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            System.out.println();
        }
    }
}
