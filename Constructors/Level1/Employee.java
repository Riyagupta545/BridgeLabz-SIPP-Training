package Constructors.Level1;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 201;
        m.department = "HR";
        m.setSalary(75000);
        m.display();
        System.out.println("Salary (via getter): ₹" + m.getSalary());
    }
}

