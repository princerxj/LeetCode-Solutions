// Title: Find the Number of Good Pairs I
// Difficulty: Easy
// Tags: Array , Hash Table
// URL: https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/
public class CountGoodPairs {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int value : nums1) {
            for (int i : nums2) {
                int a = i * k;
                if (value % a == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4};
        int[] nums2 = {1,3,4};
        int k = 1;
        int ans = numberOfPairs(nums1,nums2,k);
        System.out.println(ans);
    }
}
