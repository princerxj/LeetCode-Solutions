// Title: Count Number of Nice Subarrays
// Difficulty: Medium
// Tags: Array, Hash Table, Math, Sliding Window
// URL: https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class NiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] cnt = new int[len+1];
        cnt[0] = 1;
        int ans = 0, t = 0;
        for(int v : nums) {
            t += v & 1;
            if(t - k >= 0) {
                ans += cnt[t-k];
            }
            cnt[t]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        int ans = numberOfSubarrays(nums,k);
        System.out.println(ans);
    }
}
