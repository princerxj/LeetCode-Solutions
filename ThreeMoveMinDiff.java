// Title: Minimum Difference Between Largest and Smallest Value in Three Moves
// Difficulty: Medium
// Tags: Array, Greedy, Sorting
// URL: https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/
import java.util.Arrays;
public class ThreeMoveMinDiff {
    public static int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= 3; i++) {
            minDiff = Math.min(minDiff, nums[n - 4 + i] - nums[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,2,4};
        int ans = minDifference(nums);
        System.out.println(ans);
    }
}
