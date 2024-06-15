// Title: Minimum Increment to Make Array Unique
// Difficulty: Medium
// Tags: Array , Greedy , Sorting , Counting
// URL: https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/
import java.util.Arrays;
public class MinimumIncrement {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int tracknum = 0;
        int minIncrement = 0;
        for(int num : nums) {
            tracknum = Math.max(tracknum, num);
            minIncrement = minIncrement + tracknum - num;
            tracknum = tracknum+1;
        }
        return minIncrement;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int ans = minIncrementForUnique(nums);
        System.out.println(ans);
    }
}
