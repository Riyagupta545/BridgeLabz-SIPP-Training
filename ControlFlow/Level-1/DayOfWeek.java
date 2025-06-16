import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    

        int m = input.nextInt(); // Month
        int d = input.nextInt(); // Day
        int y = input.nextInt(); // Year

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week (0=Sunday...6=Saturday): " + dayOfWeek);

        input.close();
    }
}
