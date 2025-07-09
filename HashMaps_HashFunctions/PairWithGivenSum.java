package HashMaps_HashFunctions;
import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: (" + num + ", " + (target - num) + ")");
                return true;
            }
            set.add(num);
        }

        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3, 7, 5};
        int target = 10;
        hasPair(arr, target);
    }
}
