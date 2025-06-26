package Constructors.Level1;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double DAILY_RATE = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Amit", "Honda City", 4);
        rental.display();
    }
}

