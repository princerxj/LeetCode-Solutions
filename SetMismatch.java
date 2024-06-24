// Title: Set Mismatch
// Difficulty: Easy
// Tags: Array, HashTable, Bit Manipulation, Sorting
// URL: https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while ( i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans[0] = nums[index];
                ans[1] = index+1;
            }
        }
        return ans;
    }
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans;
        ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
}
