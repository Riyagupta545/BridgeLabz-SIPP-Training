package Inheritance;
public class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking No: " + trackingNumber);
        System.out.println("Delivered on: " + deliveryDate);
    }

    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "2025-07-01", "TRK123", "2025-07-03");
        d.getOrderStatus();
    }
}
