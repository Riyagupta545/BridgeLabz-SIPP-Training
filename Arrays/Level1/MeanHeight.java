package Arrays.Level1;
    import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.println("Mean height: " + mean);
    }
}


