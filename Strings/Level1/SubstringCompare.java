package Strings.Level1;
import java.util.Scanner;

public class SubstringCompare {
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();
        sc.close();

        String manual = manualSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Match: " + compareUsingCharAt(manual, builtIn));
    }
}
