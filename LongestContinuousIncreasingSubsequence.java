// Title: Longest Continuous Increasing Subsequence
// Difficulty: Easy
// Tags: Array
// URL: https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
public class LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        for(int i = 1; i<nums.length; i++) {
            if(nums[i]>nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(max<count) {
                max = count ;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        int ans = findLengthOfLCIS(nums);
        System.out.println(ans); //Output
    }
}
