package Strings.Level2;
import java.util.Random;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] eligibility = checkEligibility(ages);

        System.out.println("Age\tCan Vote");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(eligibility[i][0] + "\t" + eligibility[i][1]);
        }
    }

    public static int[] generateRandomAges(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(90) + 10; // 10 to 99
        }
        return arr;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }
}
