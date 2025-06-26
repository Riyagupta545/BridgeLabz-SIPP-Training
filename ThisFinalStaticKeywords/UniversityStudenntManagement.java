package ThisFinalStaticKeywords;
class UniversityStudentManagement {
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    String grade;

    UniversityStudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof UniversityStudentManagement) {
            System.out.println("University: " + universityName);
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        UniversityStudentManagement student = new UniversityStudentManagement("Ankit", 2001, "A");
        student.displayDetails();
        UniversityStudentManagement.displayTotalStudents();
    }
}
