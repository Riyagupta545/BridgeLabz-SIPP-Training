package Constructors.Level1;
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.accountNumber = "9999";
        acc.accountHolder = "Rita";
        acc.deposit(5000);
        acc.display();
        System.out.println("Balance (via getter): ₹" + acc.getBalance());
    }
}
