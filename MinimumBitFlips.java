// Title: Minimum Number of K Consecutive Bit Flips
// Difficulty: Hard
// Tags: Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum
// URL: https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/
public class MinimumBitFlips {
    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipped = new int[n];
        int flipCount = 0, result = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipCount ^= flipped[i - k];
            }
            if (nums[i] == flipCount) {
                if (i + k > n) {
                    return -1;
                }
                result++;
                flipCount ^= 1;
                flipped[i] = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int k = 1;
        int ans = minKBitFlips(nums,k);
        System.out.println(ans);
    }
}
