// Title: Sum of Square Numbers
// Difficulty: Medium
// Tags: Math , Two Pointers , Binary Search
// URL: https://leetcode.com/problems/sum-of-square-numbers/description/
public class SumOfSquares {
    public static boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left <= right) {
            long sum = left*left + right*right;
            if(sum < c) {
                left++;
            } else if (sum > c) {
                right--;
            } else if (sum == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 5;
        boolean check = judgeSquareSum(c);
        System.out.println(check);
    }
}
