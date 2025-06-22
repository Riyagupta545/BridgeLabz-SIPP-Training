package Strings.Level2;
import java.util.Scanner;

public class CustomTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String str = sc.nextLine();

        int[] range = findTrimRange(str);
        String trimmed = customSubstring(str, range[0], range[1]);
        String builtinTrim = str.trim();

        System.out.println("Custom Trimmed: '" + trimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtinTrim + "'");
        System.out.println("Match: " + trimmed.equals(builtinTrim));
    }

    public static int[] findTrimRange(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
