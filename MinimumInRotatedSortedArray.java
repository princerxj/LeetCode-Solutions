// Title: Find Minimum in Rotated Sorted Array
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int pivot = pivot(nums);
        if(pivot == -1) {
            return nums[0];
        }
        else {
            return nums[pivot+1];
        }
    }
    public static int pivot (int[] arr ) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]) {
                return mid ;
            }
            if(mid>start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = findMin(nums);
        System.out.println(ans);
    }
}
