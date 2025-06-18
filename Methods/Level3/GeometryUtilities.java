package Methods.Level3;
import java.util.Scanner;

public class GeometryUtilities {

    // Method to calculate Euclidean Distance
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and y-intercept of a line
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1 (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter point 2 (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double dist = calculateDistance(x1, y1, x2, y2);
        double[] eq = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f\n", dist);
        System.out.printf("Line Equation: y = %.2fx + %.2f\n", eq[0], eq[1]);
    }
}



