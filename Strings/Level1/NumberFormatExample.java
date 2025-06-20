package Strings.Level1;
import java.util.Scanner;

public class NumberFormatExample {
    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (or invalid text):");
        String str = sc.next();
        sc.close();

        // generateException(str);
        handleException(str);
    }
}
