package Methods.Level3;
public class NumberCheckerPart2 {

    // Method to get digit array
    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is a Harshad number
    public static boolean isHarshadNumber(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    // Method to find frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // freq[i][0] = digit, freq[i][1] = count
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int num = 162; // Sample test
        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad: " + isHarshadNumber(num, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
    }
}
