// Title: Search in Rotated Sorted Array
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot == -1) {
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target) {
            return pivot;
        }
        if(target >= nums[0]) {
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
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

    public static int binarysearch (int[] arr, int target , int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target > arr[mid]) {
                start = mid+1;
            }
            else if(target < arr[mid]) {
                end = mid-1;
            }
            else if (target == arr[mid] ) {
                return mid ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums,target);
        System.out.println(ans);
    }
}
