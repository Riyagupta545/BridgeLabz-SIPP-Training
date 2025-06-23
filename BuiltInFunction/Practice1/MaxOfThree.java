package BuiltInFunction.Practice1;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        int max = getMax(a, b, c);
        System.out.println("Maximum is: " + max);
    }

    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

