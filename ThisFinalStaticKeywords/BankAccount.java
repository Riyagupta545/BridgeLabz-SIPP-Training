package ThisFinalStaticKeywords;
class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final String accountNumber;
    double balance;

    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Holder: " + accountHolderName + ", Account No: " + accountNumber + ", Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Riya", "SB12345", 100000);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
