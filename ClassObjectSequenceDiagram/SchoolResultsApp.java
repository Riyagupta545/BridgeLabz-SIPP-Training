package ClassObjectSequenceDiagram;
import java.util.ArrayList;

// Subject class
class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

// Student class (aggregates Subject)
class Student {
    private String name;
    private ArrayList<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

// GradeCalculator class
class GradeCalculator {
    public static String calculateGrade(Student student) {
        ArrayList<Subject> subjects = student.getSubjects();
        int total = 0;

        for (Subject s : subjects) {
            total += s.getMarks();
        }

        double average = (double) total / subjects.size();

        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else return "F";
    }
}

// Main class
public class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("John");

        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        String grade = GradeCalculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println("Subject: " + s.getName() + ", Marks: " + s.getMarks());
        }

        System.out.println("Final Grade: " + grade);
    }
}
