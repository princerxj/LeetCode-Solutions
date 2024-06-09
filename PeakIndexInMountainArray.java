// Title: Peak Index in a Mountain Array
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {

    //finds the peak index in the mountain array
    public static int PeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            // If the element at mid is greater than the next element,
            // move towards left to search for the peak
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                // Otherwise, move towards right
                start = mid + 1;
            }
        }
        // At the end of the loop, start and end will converge to the peak index
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,3,0,-2};
        int ans = PeakIndex(arr);
        System.out.println("Peak index : "+ans);
    }
}
