// Title: Missing Number
// Difficulty: Easy
// Tags: Array, HashTable, Math, Binary Search, Bit Manipulation, Sorting
// URL: https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while ( i < nums.length) {
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums,i,nums[i]);
            } else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
