import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int number = input.nextInt();
        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Number of digits: " + count);
        input.close();
    }
}
