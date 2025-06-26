package ClassandObject.Level2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayTotalCost() {
        System.out.println("Total cost: ₹" + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.addItem("Pen", 10.0, 5);
        item.displayTotalCost();
        item.removeItem();
    }
}
