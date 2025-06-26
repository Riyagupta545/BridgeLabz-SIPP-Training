package Constructors.Level1;
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Notebook", 30);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}

