// Title: Sum of Squares of Special Elements
// Difficulty: Easy
// Tags: Array , Enumeration
// URL: https://leetcode.com/problems/sum-of-squares-of-special-elements/
public class SumOfSquareOfSpecialElements {
    public static  int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int newindex = i + 1;
            if(n % newindex == 0) {
                sum = sum + nums[i] * nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};
        int ans = sumOfSquares(nums);
        System.out.println(ans+"");
    }
}
