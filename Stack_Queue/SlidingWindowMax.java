package Stack_Queue;
import java.util.*;

public class SlidingWindowMax {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside the window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove indices whose values are less than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            // Add max to result once first window is completed
            if (i >= k - 1) {
                result.add(nums[deque.peek()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> maxValues = maxSlidingWindow(nums, k);
        System.out.println(maxValues); // Output: [3, 3, 5, 5, 6, 7]
    }
}
