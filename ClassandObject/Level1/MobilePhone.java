package ClassandObject.Level1;
class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S24";
        phone.price = 79999;
        phone.displayDetails();
    }
}
