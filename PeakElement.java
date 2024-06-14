// Title: Find Peak Element
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/find-peak-element/description/
public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
}
