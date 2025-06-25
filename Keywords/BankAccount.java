class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void showDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ramesh", 1001);
        acc1.showDetails();
        getTotalAccounts();
    }
}
