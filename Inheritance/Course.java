package Inheritance;
public class Course {
    String courseName;
    int duration;

    Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void showDetails() {
        System.out.println("Course: " + courseName + " (" + duration + " hrs)");
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: ₹" + fee + ", Discount: ₹" + discount);
    }

    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("DSA", 40, "Coursera", true, 5000, 1000);
        poc.showDetails();
    }
}
