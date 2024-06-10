// Title:  How Many Numbers Are Smaller Than the Current Number
// Difficulty: Easy
// Tags : Array , Hash Table , Sorting , Counting
// URL: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    //Method for counting the numbers smaller than current
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i =0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
}
