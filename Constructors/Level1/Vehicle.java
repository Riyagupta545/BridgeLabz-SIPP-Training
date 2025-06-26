package Constructors.Level1;
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500.0;

    Vehicle(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Raj", "Bike");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000);
        v1.displayVehicleDetails();
    }
}
