package LinkedLists;
class Item {
    String name;
    int id, qty;
    double price;
    Item next;

    Item(int id, String name, int qty, double price) {
        this.id = id; this.name = name; this.qty = qty; this.price = price;
    }
}

public class Inventory {
    Item head;

    // Add at end
    void addItem(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        if (head == null) head = newItem;
        else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
    }

    // Remove by ID
    void removeItem(int id) {
        Item temp = head, prev = null;
        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        if (prev == null) head = head.next;
        else prev.next = temp.next;
    }

    // Update quantity
    void updateQty(int id, int qty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) { temp.qty = qty; return; }
            temp = temp.next;
        }
    }

    // Search by ID or Name
    void search(String keyword) {
        Item temp = head;
        while (temp != null) {
            if (String.valueOf(temp.id).equals(keyword) || temp.name.equalsIgnoreCase(keyword))
                System.out.println("Found: " + temp.name + ", Qty: " + temp.qty + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    // Total inventory value
    void totalValue() {
        double total = 0;
        for (Item temp = head; temp != null; temp = temp.next)
            total += temp.qty * temp.price;
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display all items
    void display() {
        for (Item temp = head; temp != null; temp = temp.next)
            System.out.println("ID: " + temp.id + ", " + temp.name + ", Qty: " + temp.qty + ", Price: " + temp.price);
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(101, "Pen", 50, 10.0);
        inv.addItem(102, "Notebook", 20, 45.0);
        inv.display();
        inv.updateQty(101, 60);
        inv.search("Notebook");
        inv.totalValue();
        inv.removeItem(102);
        System.out.println("After Deletion:");
        inv.display();
    }
}

