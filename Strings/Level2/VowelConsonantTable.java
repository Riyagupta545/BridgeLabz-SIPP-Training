package Strings.Level2;

import java.util.Scanner;

public class VowelConsonantTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = VowelConsonantCount.getCharType(ch);
            System.out.println(ch + "\t" + type);
        }
    }
}
