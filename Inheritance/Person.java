package Inheritance;
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayCommonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayCommonDetails();
        System.out.println("Subject: " + subject);
        System.out.println("-----------------------------");
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayCommonDetails();
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayCommonDetails();
        System.out.println("Department: " + department);
        System.out.println("-----------------------------");
    }
}

class SchoolDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Verma", 40, "Mathematics");
        Student student = new Student("Anita", 16, 11);
        Staff staff = new Staff("Rakesh", 35, "Library");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
