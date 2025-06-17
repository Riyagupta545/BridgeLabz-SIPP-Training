package Arrays.Level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.println(num + " is Positive and " + (num % 2 == 0 ? "Even" : "Odd"));
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and Last elements are Equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is Greater than Last");
        else
            System.out.println("First element is Less than Last");
    }
}


