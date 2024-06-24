// Title: Find the Duplicate Number
// Difficulty: Medium
// Tags: Array, Two Pointers, Binary Search, Bit Manipulation
// URL: https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i = 0, ans = 0;
        while( i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans = nums[index];
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
}
