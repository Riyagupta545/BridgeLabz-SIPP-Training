package ClassandObject.Level2;
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Neha";
        acc.accountNumber = "1234567890";
        acc.balance = 10000;
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
