package Constructors.Level1;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void showName() {
        System.out.println("Name (protected): " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Riya";
        pg.setCGPA(8.6);
        pg.showName();
        System.out.println("CGPA (private via getter): " + pg.getCGPA());
    }
}
