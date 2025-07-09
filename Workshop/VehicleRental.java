package Workshop;
import java.util.Scanner;

// Rentable interface
interface Rentable {
    double calculateRent(int days);
}

// Abstract Vehicle class
abstract class Vehicle implements Rentable {
    protected String brand;
    protected String model;
    protected double baseRate;

    public Vehicle(String brand, String model, double baseRate) {
        this.brand = brand;
        this.model = model;
        this.baseRate = baseRate;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getBaseRate() { return baseRate; }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}

// Car class
class Car extends Vehicle {
    public Car(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 200.0;
        return (baseRate * days) + surcharge;
    }
}

// Truck class
class Truck extends Vehicle {
    public Truck(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double surchargePerDay = 150.0;
        return (baseRate * days) + (surchargePerDay * days);
    }
}

// Customer class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        double rent = vehicle.calculateRent(days);
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Vehicle Rented: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Total Rent for " + days + " day(s): ₹" + rent);
        System.out.println("Please pay ₹" + rent + " to complete the rental.");
    }
}

// Main class
public class VehicleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get customer name
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        // Step 2: Choose vehicle type
        System.out.println("\nChoose vehicle to rent:");
        System.out.println("1. Bike (₹100/day)");
        System.out.println("2. Car (₹500/day + ₹200 fixed surcharge)");
        System.out.println("3. Truck (₹800/day + ₹150/day surcharge)");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        // Step 3: Enter number of rental days
        System.out.print("Enter number of days to rent: ");
        int days = scanner.nextInt();

        Vehicle vehicle = null;

        // Step 4: Create selected vehicle
        switch (choice) {
            case 1:
                vehicle = new Bike("Hero", "Splendor", 100);
                break;
            case 2:
                vehicle = new Car("Honda", "City", 500);
                break;
            case 3:
                vehicle = new Truck("Tata", "407", 800);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        // Step 5: Process rental
        customer.rentVehicle(vehicle, days);

        scanner.close();
    }
}