package Workshop;
import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0, bill = 0, gstRate = 0.18;

        System.out.println("Welcome to Ravi's Café");

        while (true) {
            System.out.print("\nEnter coffee type (Espresso, Latte, Cappuccino, Mocha) or type 'exit' to stop: ");
            coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();  // Clear buffer

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 130;
                    break;
                case "mocha":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            bill = price * quantity;
            double gst = bill * gstRate;
            double total = bill + gst;

            System.out.println("Base Bill: ₹" + bill);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Total Bill: ₹" + total);
        }

        sc.close();
    }
}
