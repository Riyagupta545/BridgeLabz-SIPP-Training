package EncapsulationAndPolymorphism;
abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id; this.name = name; this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base: " + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    String dept;
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() { return getBaseSalary(); }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return "Dept: " + dept; }
}

class PartTimeEmployee extends Employee implements Department {
    int hours;
    double rate;
    String dept;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours; this.rate = rate;
    }
    public double calculateSalary() { return hours * rate; }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return "Dept: " + dept; }
}

public class EMS {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 30000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 100, 150);
        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
