package Strings.Level2;
import java.util.Scanner;

public class ShortestLongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengthPairs = toWordLengthArray(words);

        String shortestWord = words[0];
        String longestWord = words[0];
        int minLen = getLength(words[0]);
        int maxLen = getLength(words[0]);

        for (int i = 1; i < wordLengthPairs.length; i++) {
            int len = Integer.parseInt(wordLengthPairs[i][1]);
            if (len < minLen) {
                minLen = len;
                shortestWord = wordLengthPairs[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longestWord = wordLengthPairs[i][0];
            }
        }

        System.out.println("Shortest Word: " + shortestWord + " (" + minLen + ")");
        System.out.println("Longest Word: " + longestWord + " (" + maxLen + ")");
    }

    // Method to split the string into words manually
    public static String[] splitWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }

        String[] words = new String[count + 1];
        int wordIndex = 0, start = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += str.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    // Convert word array to 2D array with word and its length
    public static String[][] toWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Method to find length of string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }
}
