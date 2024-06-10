// Title: Two Sum
// Difficulty: Easy
// Tags: Array , HashTable
// URL: https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;

public class TwoSum {
    //Method to find two sum
    public static int[] twoSum(int[] nums, int target) {
        int[] ts = new int[2];
        for(int i=  0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    ts[0] = i;
                    ts[1] = j;
                }
            }
        }
        return ts;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
