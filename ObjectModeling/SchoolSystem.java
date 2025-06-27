package ObjectModeling;
import java.util.*;

class Course {
    String courseName;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.showCourses();
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Green Valley High");
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        c1.showStudents();
        c2.showStudents();
    }
}
