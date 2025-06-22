package Strings.Level3;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);
        if (result == 0) {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // For all ASCII characters

        // First loop: count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Second loop: find first character with freq = 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return 0; // return null character if none found
    }
}
