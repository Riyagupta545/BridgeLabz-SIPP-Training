package Methods.Level2;
import java.util.Scanner;
public class FactorAnalyzer {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static int findProduct(int[] arr) {
        int product = 1;
        for (int val : arr) product *= val;
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int val : arr) sum += Math.pow(val, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");
        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
