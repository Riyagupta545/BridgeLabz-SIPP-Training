package ClassandObject.Level1;
class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 5001;
        i.itemName = "Notebook";
        i.price = 45.0;
        i.displayDetails();
        System.out.println("Total cost for 3 units: ₹" + i.calculateTotalCost(3));
    }
}
