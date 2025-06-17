package Methods.Level2;
import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0; // cm to meters
            data[i][2] = weight / (height * height);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        System.out.println("Weight | Height | BMI | Status");
        for (int i = 0; i < 10; i++) {
            double bmi = persons[i][2];
            System.out.printf("%.1f kg | %.1f cm | %.2f | %s\n", persons[i][0], persons[i][1], bmi, getStatus(bmi));
        }
    }
}
