package Arrays.Level2;

import java.util.Scanner;

public class MarksGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // Physics, Chemistry, Maths
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 75)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else if (percent[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("Physics\tChem\tMath\t% \tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + percent[i] + "\t" + grade[i]);
        }
    }
}
