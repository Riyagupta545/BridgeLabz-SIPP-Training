package Inheritance;
public class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayCommonDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayCommonDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayCommonDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " times/day");
        System.out.println("-----------------------------");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayCommonDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("-----------------------------");
    }
}

class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount(1002, 7000.0, 3);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 15000.0, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
