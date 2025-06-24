package BuiltInFunction.Practice1;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
        sc.close();
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
