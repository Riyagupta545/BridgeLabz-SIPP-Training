package Methods.Level3;
import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Generate random 2-digit scores for PCM
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // Scores between 40 to 100
            }
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Display Scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-8s%-10s%-10s%-10s%-10s%-10s%-10s\n", "RollNo", "Physics", "Chemistry", "Math", "Total", "Avg", "Percent");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] resultStats = calculateResults(pcmScores);
        displayScorecard(pcmScores, resultStats);
    }
}
