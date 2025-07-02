package Inheritance;
public class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH001", "ON", 24);
        t.displayStatus();
    }
}
