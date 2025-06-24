class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void setDetails(String holder, int accNo, double bal) {
        accountHolder = holder;
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[]) {
        BankAccount acc = new BankAccount();
        acc.setDetails("Anjali", 123456, 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.showBalance();
    }
}
