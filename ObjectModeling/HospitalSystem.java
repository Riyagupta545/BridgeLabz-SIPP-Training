package ObjectModeling;
import java.util.*;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
        p.addDoctor(this);
    }
}

class Patient {
    String name;
    List<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    void showDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println(d.name);
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Anjali");
        Doctor d2 = new Doctor("Dr. Ramesh");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Sneha");

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        p1.showDoctors();
        p2.showDoctors();
    }
}

