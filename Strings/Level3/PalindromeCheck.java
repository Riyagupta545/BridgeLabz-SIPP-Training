package Strings.Level3;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String text = sc.nextLine();

        boolean logic1 = isPalindromeLogic1(text);
        boolean logic2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeLogic3(text);

        System.out.println("Logic 1 (Two-pointer): " + logic1);
        System.out.println("Logic 2 (Recursion): " + logic2);
        System.out.println("Logic 3 (Reverse and Compare): " + logic3);
    }

    // Logic 1: Two-pointer approach
    public static boolean isPalindromeLogic1(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursion
    public static boolean isPalindromeLogic2(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeLogic2(str, start + 1, end - 1);
    }

    // Logic 3: Reverse and compare
    public static boolean isPalindromeLogic3(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i])
                return false;
        }
        return true;
    }

    public static char[] reverseString(String str) {
        int len = str.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = str.charAt(len - i - 1);
        }
        return reversed;
    }
}
