package Strings.Level1;
import java.util.Scanner;

public class IllegalArgumentExample {

    // This will throw an exception because start > end
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2)); // Invalid substring range
    }

    // Method to handle IllegalArgumentException or StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (at least 6 characters):");
        String str = sc.next();
        sc.close();

        System.out.println("Handling exception while doing str.substring(5, 2)...");
        handleException(str);  // Safe exception handling
    }
}
