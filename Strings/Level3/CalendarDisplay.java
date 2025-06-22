package Strings.Level3;
import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = { "", "January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December" };
    static int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30,
                                 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int days = getNumberOfDays(month, year);
        int startDay = getFirstDay(month, year);

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int i = 1; i <= days; i++) {
            System.out.printf("%2d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (d + x + 31 * m / 12) % 7;
        return dayOfWeek;
    }
}
