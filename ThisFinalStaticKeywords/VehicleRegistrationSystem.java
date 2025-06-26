package ThisFinalStaticKeywords;
class VehicleRegistrationSystem {
    static double registrationFee = 1500.0;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof VehicleRegistrationSystem) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem vehicle = new VehicleRegistrationSystem("Ravi", "Bike", "MH12AB1234");
        vehicle.displayDetails();
        updateRegistrationFee(1800);
        vehicle.displayDetails();
    }
}
