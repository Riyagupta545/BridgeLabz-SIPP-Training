package Strings.Level2;
// 1. Find Length Without Using length()
import java.util.Scanner;

public class StringLengthWithoutBuiltIn {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        sc.close();

        int manualLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}

// Additional programs 2–10 will follow similar structure in separate Java classes.
