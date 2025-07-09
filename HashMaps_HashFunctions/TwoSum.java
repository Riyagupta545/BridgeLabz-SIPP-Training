package HashMaps_HashFunctions;
import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result)); // Output: [0, 1]
    }
}

