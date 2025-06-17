package Methods.Level1;
import java.util.Scanner;

public class ParkRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Rounds needed: " + rounds);
    }
}
