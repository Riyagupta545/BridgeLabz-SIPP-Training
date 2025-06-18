package Methods.Level3;
import java.util.Random;

public class FootballTeamHeight {

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Player Heights:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nResults:");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    static int[] generateRandomHeights(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    static double calculateMean(int[] arr) {
        return Math.round((double) calculateSum(arr) / arr.length * 100.0) / 100.0;
    }

    static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr)
            if (num < min)
                min = num;
        return min;
    }

    static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr)
            if (num > max)
                max = num;
        return max;
    }
}
