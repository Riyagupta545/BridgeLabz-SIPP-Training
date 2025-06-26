package ThisFinalStaticKeywords;
class EmployeeManagement {
    static String companyName = "Infosys";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    EmployeeManagement(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof EmployeeManagement) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement("Riya", 101, "Developer");
        emp.displayDetails();
        EmployeeManagement.displayTotalEmployees();
    }
}
