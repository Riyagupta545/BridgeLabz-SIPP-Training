package Strings.Level1;
import java.util.Scanner;

public class StringIndexOutOfBoundsExample {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Invalid index
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        sc.close();

        // generateException(str); // Uncomment to crash
        handleException(str);
    }
}
