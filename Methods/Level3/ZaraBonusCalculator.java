package Methods.Level3;
   import java.util.Random;

public class ZaraBonusCalculator {

    static final int EMPLOYEE_COUNT = 10;

    // Generate random salary and service years
    public static int[][] generateEmployeeData() {
        int[][] data = new int[EMPLOYEE_COUNT][2];
        Random rand = new Random();
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            data[i][0] = 30000 + rand.nextInt(70000); // salary between 30000 to 99999
            data[i][1] = rand.nextInt(11);            // service years between 0 to 10
        }
        return data;
    }

    // Calculate new salary and bonus
    public static double[][] calculateBonuses(int[][] data) {
        double[][] updated = new double[EMPLOYEE_COUNT][2];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updated[i][0] = bonus;
            updated[i][1] = newSalary;
        }
        return updated;
    }

    // Display in tabular format
    public static void displayReport(int[][] original, double[][] updated) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.printf("%-10s%-12s%-10s%-12s%-12s\n", "EmpID", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = original[i][0];
            int years = original[i][1];
            double bonus = updated[i][0];
            double newSalary = updated[i][1];

            totalOld += salary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%-10d%-12d%-10d%-12.2f%-12.2f\n", (i + 1), salary, years, bonus, newSalary);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTALS     %-12.2f%-10s%-12.2f%-12.2f\n", totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] bonusData = calculateBonuses(employeeData);
        displayReport(employeeData, bonusData);
    }
}
 

