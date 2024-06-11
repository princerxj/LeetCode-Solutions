// Title: Product of Array Except Self
// Difficulty: Medium
// Tags: Arrays , Prefix Sum
// URL: https://leetcode.com/problems/product-of-array-except-self/description/
import java.util.Arrays;


public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        for(int i = 0; i<nums.length; i++) {
            ans[i] = product ;
            product = product*nums[i];
        }
        product = 1;
        for(int j = nums.length-1 ; j>=0; j--) {
            ans[j] = ans[j]*product;
            product = product*nums[j];
        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans)); //Output
    }
}
