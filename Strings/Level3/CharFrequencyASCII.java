package Strings.Level3;

import java.util.Scanner;

public class CharFrequencyASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + "\t\t" + result[i][1]);
            }
        }
    }

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        boolean[] visited = new boolean[256];
        String[][] result = new String[str.length()][2];
        int index = 0;

        // Prepare result with unique characters and their frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                visited[ch] = true;
                index++;
            }
        }

        return result;
    }
}
