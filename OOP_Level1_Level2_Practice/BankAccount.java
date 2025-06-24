class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(long accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    void showDetails() {
        System.out.println("Account No: " + accountNumber);     // public access
        System.out.println("Account Holder: " + accountHolder); // protected access
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456789L, "Lakshmi", 5000);
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.showDetails();
        System.out.println("Balance: Rs." + sa.getBalance());
    }
}
