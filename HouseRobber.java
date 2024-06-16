// Title: House Robber
// Difficulty: Medium
// Tags: Array , Dynamic Programming
// URL: https://leetcode.com/problems/house-robber/description/
public class HouseRobber {
    public static int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int prev1 = 0;
        int prev2 = 0;
        for(int num : nums) {
            int current = Math.max(prev1,prev2+num);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int max= rob(nums);
        System.out.println(max);
    }
}
