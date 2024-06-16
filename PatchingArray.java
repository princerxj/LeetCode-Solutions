// Title: Patching Array
// Difficulty: Hard
// Tags: Array , Greedy
// URL: https://leetcode.com/problems/patching-array/description/
public class PatchingArray {
    public static int minPatches(int[] nums, int n) {
        long miss = 1;
        int patches = 0, i = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss += miss;
                patches++;
            }
        }
        return patches;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,10};
        int n = 20;
        int ans = minPatches(nums,n);
        System.out.println(ans);
    }
}
