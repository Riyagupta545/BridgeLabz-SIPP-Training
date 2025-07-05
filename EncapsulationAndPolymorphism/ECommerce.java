package EncapsulationAndPolymorphism;
abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.productId = id; this.name = name; this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST on Electronics"; }
}

class Clothing extends Product implements Taxable {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.20; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST on Clothing"; }
}

class Groceries extends Product {
    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommerce {
    static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        System.out.println(p.getName() + " -> Final Price: " + (price + tax - discount));
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);
        printFinalPrice(p1);
        printFinalPrice(p2);
        printFinalPrice(p3);
    }
}

