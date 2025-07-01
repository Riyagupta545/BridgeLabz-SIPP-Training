package ExtraStrings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }

        System.out.println("Toggled Case: " + result);
    }
}
