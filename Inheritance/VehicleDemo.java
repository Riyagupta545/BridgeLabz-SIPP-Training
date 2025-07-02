package Inheritance;
interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displaySpecs() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        displaySpecs();
        System.out.println("Charging...🔋");
        System.out.println("-----------------------------");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        displaySpecs();
        System.out.println("Refueling...⛽");
        System.out.println("-----------------------------");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(160, "Hyundai Verna");

        ev.charge();
        pv.refuel();
    }
}
