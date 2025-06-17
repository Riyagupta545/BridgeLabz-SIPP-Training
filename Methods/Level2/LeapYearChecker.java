package Methods.Level2;
import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
        } else {
            System.out.println("Is Leap Year? " + isLeapYear(year));
        }
    }
}
