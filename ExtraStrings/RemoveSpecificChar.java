package ExtraStrings;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Character to remove: ");
        char ch = sc.next().charAt(0);

        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result += c;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
