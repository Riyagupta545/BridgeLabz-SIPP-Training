package Methods.Level3;
public class NumberChecker {

    // Count digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in an array
    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Check if number is a duck number
    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && !s.startsWith("0");
    }

    // Check if number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == num;
    }

    // Find largest and second largest digits
    public static int[] findTwoLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }

    // Find smallest and second smallest digits
    public static int[] findTwoSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }

    // Test in main
    public static void main(String[] args) {
        int num = 153; // Test input

        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Duck Number: " + isDuckNumber(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
