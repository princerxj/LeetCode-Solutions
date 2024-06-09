// Title: Running Sum of 1d Array
// Difficulty: Easy
// Tags: Array , Prefix Sum
// URL: https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;
public class RunningSumOf1DArray {
    // Method to compute the running sum of a 1D array
    public static int[] runningsum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningsum(nums);
        System.out.println(Arrays.toString(ans)); //Output
    }
}
