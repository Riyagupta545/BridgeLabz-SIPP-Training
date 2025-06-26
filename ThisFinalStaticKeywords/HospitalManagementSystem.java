package ThisFinalStaticKeywords;
class HospitalManagementSystem {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    HospitalManagementSystem(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof HospitalManagementSystem) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem patient = new HospitalManagementSystem("Sneha", 30, "Cough", 1001);
        patient.displayDetails();
        HospitalManagementSystem.getTotalPatients();
    }
}
