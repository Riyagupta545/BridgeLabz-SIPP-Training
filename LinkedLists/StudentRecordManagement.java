package LinkedLists;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {
    private Student head;

    // Add student at beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add student at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add student at specific position (1-based index)
    public void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Student newStudent = new Student(roll, name, age, grade);
        Student temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete student by roll number
    public void deleteByRollNumber(int roll) {
        if (head == null) return;

        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student with Roll Number " + roll + " deleted.");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Student with Roll Number " + roll + " deleted.");
    }

    // Search by roll number
    public void searchByRollNumber(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found: " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by roll number
    public void updateGrade(int roll, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all student records
    public void display() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + " | Name: " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning\n2. Add at End\n3. Add at Position\n4. Delete by Roll No\n5. Search by Roll No");
            System.out.println("6. Update Grade\n7. Display All\n8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    if (choice == 1) srm.addAtBeginning(roll, name, age, grade);
                    else if (choice == 2) srm.addAtEnd(roll, name, age, grade);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        srm.addAtPosition(pos, roll, name, age, grade);
                    }
                    break;
                }
                case 4:
                    System.out.print("Enter Roll No to Delete: ");
                    srm.deleteByRollNumber(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll No to Search: ");
                    srm.searchByRollNumber(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    char grade = sc.next().charAt(0);
                    srm.updateGrade(roll, grade);
                    break;
                case 7:
                    srm.display();
                    break;
                case 8:
                    System.out.println("Exiting.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
