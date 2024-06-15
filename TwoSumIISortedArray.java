// Title: Two Sum II - Input Array Is Sorted
// Difficulty: Medium
// Tags: Array , Two Pointers , Binary Search
// URL: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;
public class TwoSumIISortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(numbers[left] + numbers[right] != target) {
            int sum = numbers[left] + numbers[right];
            if(sum > target) {
                right-- ;
            } else {
                left++;
            }
        }
        return new int[] {left+1, right+1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers,target);
        System.out.println(Arrays.toString(ans));
    }
}
