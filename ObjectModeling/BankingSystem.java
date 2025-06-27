package ObjectModeling;
class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        System.out.println("Opening account for " + customer.name + " in " + name);
        customer.bank = this;
    }
}

class Customer {
    String name;
    double balance;
    Bank bank;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance at " + bank.name + ": ₹" + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        Customer cust = new Customer("Ravi", 5000);
        bank.openAccount(cust);
        cust.viewBalance();
    }
}
