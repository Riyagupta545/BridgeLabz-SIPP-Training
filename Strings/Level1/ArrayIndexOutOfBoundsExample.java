package Strings.Level1;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void generateException(String[] arr) {
        System.out.println(arr[5]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        // generateException(arr);
        handleException(arr);
    }
}
