package Strings.Level3;
import java.util.Scanner;

public class FrequencyWithUniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        int[] frequencies = findFrequencies(text);

        System.out.println("Character\tFrequency");
        for (char ch : uniqueChars) {
            if (ch != 0) {
                System.out.println(ch + "\t\t" + frequencies[ch]);
            }
        }
    }

    public static char[] findUniqueCharacters(String str) {
        int n = str.length();
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

    public static int[] findFrequencies(String str) {
        int[] freq = new int[256]; // For ASCII characters
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }
}
