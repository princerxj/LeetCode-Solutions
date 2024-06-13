// Title: Find First and Last Position of Element in Sorted Array
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr2 = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target>nums[mid]) {
                start = mid+1;
            }
            else if(target<nums[mid]) {
                end = mid -1;
            }
            else if( target == nums[mid]) {
                int temp = mid;
                int var = mid;
                for(int i = temp; i<nums.length; i++) {
                    if(target == nums[i]) {
                        temp++;
                    }
                    else {
                        break;
                    }
                }
                for(int j = var; j>=0; j--) {
                    if(target == nums[j]) {
                        var = j;
                    }
                    else {
                        break;
                    }
                }
                return new int[]{var, temp-1};
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
