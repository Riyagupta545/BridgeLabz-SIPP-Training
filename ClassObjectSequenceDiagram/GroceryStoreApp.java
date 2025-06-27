package ClassObjectSequenceDiagram;
import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

// Customer class (composes Products)
class Customer {
    private String name;
    private ArrayList<Product> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator class
class BillGenerator {
    public static double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getCart()) {
            total += p.getCost();
        }
        return total;
    }
}

// Main class
public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        customer.addProduct(new Product("Apples", 2.0, 3.0)); // 2kg @ $3
        customer.addProduct(new Product("Milk", 1.0, 2.0));   // 1 liter @ $2

        double total = BillGenerator.generateBill(customer);

        System.out.println("Customer: " + customer.getName());
        for (Product p : customer.getCart()) {
            System.out.println("Product: " + p.getName() +
                               ", Quantity: " + p.getQuantity() +
                               ", Unit Price: $" + p.getPricePerUnit() +
                               ", Subtotal: $" + p.getCost());
        }

        System.out.println("Total Bill: $" + total);
    }
}
