import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");

        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0)
                    System.out.println("Result: " + (first / second));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
