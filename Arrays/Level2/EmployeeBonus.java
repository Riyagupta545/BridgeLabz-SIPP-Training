package Arrays.Level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            service[i] = sc.nextDouble();

            if (salary[i] < 0 || service[i] < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = (service[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}

