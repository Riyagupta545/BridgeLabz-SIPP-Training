package Methods.Level3;
import java.util.Scanner;
public class CalendarGenerator {

    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    // Get days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) return 29;
        return daysInMonth[month];
    }

    // Get first day of the month using Zeller’s Congruence
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 2) {
            month += 12;
            year--;
        }
        int q = 1;
        int m = month + 1;
        int K = year % 100;
        int J = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;

        // Return 0 for Sunday, 1 for Monday...
        return (h + 5) % 7;
    }

    // Print calendar
    public static void printCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int start = getFirstDayOfMonth(month, year);

        System.out.println("\n\t" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1;

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}
