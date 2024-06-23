// Title: Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
// Difficulty: Medium
// Tags: Array, Queue, Sliding Window, Heap, Ordered Set, Monotonic Queue
// URL: https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/
import java.util.Deque;
import java.util.LinkedList;

public class LongestSubarrayWithLimit {
    public static int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int start = 0;
        int result = 0;

        for (int end = 0; end < nums.length; end++) {
            while (!maxDeque.isEmpty() && nums[end] > maxDeque.peekLast()) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(nums[end]);

            while (!minDeque.isEmpty() && nums[end] < minDeque.peekLast()) {
                minDeque.pollLast();
            }
            minDeque.addLast(nums[end]);

            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                if (nums[start] == maxDeque.peekFirst()) {
                    maxDeque.pollFirst();
                }
                if (nums[start] == minDeque.peekFirst()) {
                    minDeque.pollFirst();
                }
                start++;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8,2,4,7};
        int limit = 4;
        int ans = longestSubarray(nums,limit);
        System.out.println(ans);
    }
}
