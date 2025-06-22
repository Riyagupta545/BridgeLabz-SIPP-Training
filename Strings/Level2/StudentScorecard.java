package Strings.Level2;
import java.util.*;

public class StudentScorecard {
    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generatePCM(students);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + "\t");
            int total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
                total += scores[i][j];
            }
            System.out.printf("%d\t%.2f\t%.2f\t%s\n", total, stats[i][0], stats[i][1], grades[i]);
        }
    }

    public static int[][] generatePCM(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] result = new double[scores.length][2]; // avg and percent
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = Math.round(avg * 100.0) / 100.0;
            result[i][1] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][1];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
}

