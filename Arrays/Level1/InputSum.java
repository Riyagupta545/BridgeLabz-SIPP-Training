package Arrays.Level1;
   import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (index == 10) break;
            System.out.print("Enter number: ");
            double input = sc.nextDouble();
            if (input <= 0) break;
            values[index++] = input;
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }
        System.out.println("\nTotal: " + total);
    }
}
 

