package Methods.Level3;

public class NumberChecker5 {

    // Method to get factors of a number
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    // Method to get sum of proper divisors (excluding the number itself)
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Method to check for perfect number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Method to check for abundant number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Method to check for deficient number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Method to check for strong number
    public static boolean isStrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += factorial(d);
            num /= 10;
        }
        return sum == original;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to sum factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to multiply all factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to get product of cube of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        int num = 28; // Sample
        int[] factors = getFactors(num);

        System.out.println("Number: " + num);
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}

