package Strings.Level2;
import java.util.Scanner;

public class CustomStringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customWords = splitWords(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Custom Split:");
        for (String word : customWords) System.out.println(word);
        System.out.println("Built-in Split:");
        for (String word : builtInWords) System.out.println(word);

        System.out.println("Are both splits equal? " + compareArrays(customWords, builtInWords));
    }

    static String[] splitWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ' && !inWord) {
                    wordCount++;
                    inWord = true;
                } else if (ch == ' ') {
                    inWord = false;
                }
            } catch (Exception e) {
                break;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= getStringLength(text); i++) {
            if (i == getStringLength(text) || text.charAt(i) == ' ') {
                if (start != i) {
                    String word = "";
                    for (int j = start; j < i; j++) {
                        word += text.charAt(j);
                    }
                    words[index++] = word;
                }
                start = i + 1;
            }
        }

        return words;
    }

    static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
