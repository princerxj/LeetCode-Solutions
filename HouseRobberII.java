// Title: House Robber II
// Difficulty: Medium
// Tags: Array , Dynamic Programming
// URL: https://leetcode.com/problems/house-robber-ii/description/
public class HouseRobberII {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max1 = robLinear(nums, 0, nums.length - 2);
        int max2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }
    public static int robLinear(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int max = rob(nums);
        System.out.println(max);
    }
}
