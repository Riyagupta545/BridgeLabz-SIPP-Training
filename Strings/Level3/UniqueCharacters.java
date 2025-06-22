package Strings.Level3;
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);
        System.out.println("Unique characters:");
        for (char ch : unique) {
            if (ch != 0) {
                System.out.print(ch + " ");
            }
        }
    }

    // Get the length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // reached the end of string
        }
        return count;
    }

    // Find unique characters using nested loops
    public static char[] findUniqueCharacters(String str) {
        int n = getLength(str);
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index++] = current;
            }
        }

        return unique;
    }
}
