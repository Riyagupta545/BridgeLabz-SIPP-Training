import java.util.Scanner;

class HarshadChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        int number = input.nextInt();
        int sum = 0, temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is Not a Harshad Number");
        }

        input.close();
    }
}
