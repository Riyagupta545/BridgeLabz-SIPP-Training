package ObjectModeling;
import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee emp) {
        employees.add(emp);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Clara"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showStructure();
    }
}
