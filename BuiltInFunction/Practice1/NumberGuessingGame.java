package BuiltInFunction.Practice1;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100.");
        
        while (true) {
            int guess = generateGuess(low, high, rand);
            System.out.println("Is your number " + guess + "? (enter: high, low, correct)");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number.");
                break;
            }
        }
        sc.close();
    }

    public static int generateGuess(int low, int high, Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }
}
