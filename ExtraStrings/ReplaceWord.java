package ExtraStrings;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.next();
        System.out.print("New word: ");
        String newWord = sc.next();

        String modified = sentence.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + modified);
    }
}
