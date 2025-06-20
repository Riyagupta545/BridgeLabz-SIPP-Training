package Strings.Level1;
import java.util.Scanner;

public class CompareStrings {
    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean result1 = compareUsingCharAt(str1, str2);
        boolean result2 = str1.equals(str2);

        System.out.println("CharAt compare: " + result1);
        System.out.println("equals() compare: " + result2);
        System.out.println("Results match: " + (result1 == result2));
    }
}
