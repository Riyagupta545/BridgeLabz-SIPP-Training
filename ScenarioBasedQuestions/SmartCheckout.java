package ScenarioBasedQuestions;
import java.util.*;

class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

public class SmartCheckout {
    Queue<Customer> checkoutQueue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    void addCustomer(Customer customer) {
        checkoutQueue.add(customer);
    }

    void processCustomer() {
        Customer c = checkoutQueue.poll();
        if (c == null) return;

        int total = 0;
        System.out.println("Processing " + c.name);
        for (String item : c.items) {
            if (priceMap.containsKey(item) && stockMap.getOrDefault(item, 0) > 0) {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            } else {
                System.out.println("Item not available or out of stock: " + item);
            }
        }
        System.out.println(c.name + "'s Bill: ₹" + total + "\n");
    }

    public static void main(String[] args) {
        SmartCheckout shop = new SmartCheckout();

        // Initialize prices and stocks
        shop.priceMap.put("Milk", 50);
        shop.priceMap.put("Bread", 30);
        shop.priceMap.put("Eggs", 10);

        shop.stockMap.put("Milk", 2);
        shop.stockMap.put("Bread", 1);
        shop.stockMap.put("Eggs", 5);

        // Add customers
        shop.addCustomer(new Customer("Alice", Arrays.asList("Milk", "Bread", "Eggs")));
        shop.addCustomer(new Customer("Bob", Arrays.asList("Milk", "Milk", "Eggs")));

        // Process customers
        shop.processCustomer(); // Alice
        shop.processCustomer(); // Bob
    }
}

