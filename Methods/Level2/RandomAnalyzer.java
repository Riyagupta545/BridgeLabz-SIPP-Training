package Methods.Level2;
public class RandomAnalyzer {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000 + 1000); // 1000 to 9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.print("Random 4-digit numbers: ");
        for (int num : randomNumbers) System.out.print(num + " ");
        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\nMin: %.0f\nMax: %.0f\n", results[0], results[1], results[2]);
    }
}
