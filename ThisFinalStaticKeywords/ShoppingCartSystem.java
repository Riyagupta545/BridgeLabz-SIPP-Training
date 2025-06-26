package ThisFinalStaticKeywords;
class ShoppingCartSystem {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof ShoppingCartSystem) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName + ", Price: ₹" + price + ", Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        ShoppingCartSystem product = new ShoppingCartSystem(101, "Laptop", 50000, 2);
        product.displayDetails();
        updateDiscount(15);
        System.out.println("Updated Discount: " + discount + "%");
    }
}

