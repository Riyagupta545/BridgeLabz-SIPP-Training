package Constructors.Level1;
class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "ABC Institute";

    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 4000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
    }
}

