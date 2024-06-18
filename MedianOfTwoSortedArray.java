// Title: Median of Two Sorted Arrays
// Difficulty: Hard
// Tags: Array, Binary Search, Divide and Conquer
// URL: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
import java.util.Arrays;

public class MedianOfTwoSortedArray {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int[] merged = new int[m+n];
            for(int i = 0; i < merged.length; i++) {
                if(i < m) {
                    merged[i] = nums1[i];
                } else {
                    merged[i] = nums2[i-m];
                }
            }
            Arrays.sort(merged);
            double median;
            if(merged.length % 2 == 0) {
                int firstMid = (merged.length - 1) / 2;
                int secondMid = firstMid + 1;
                median = (double) (merged[firstMid] + merged[secondMid]) / 2;
            } else {
                int mid = (merged.length - 1) / 2;
                median = merged[mid];
            }
            return median;
        }

        public static void main(String[] args) {
            int[] nums1 = {2,3,5,6,8};
            int[] nums2 = {9,7,4};
            double ans = findMedianSortedArrays(nums1,nums2);
            System.out.println(ans);
        }

}
