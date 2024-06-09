// Title: Subtract the Product and Sum of Digits of an Integer
// Difficulty: Easy
// Tags: Math
// URL: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
public class SubtractProductAndSum {
    public static int subtractProductAndSum (int n) {
        //Take the initial sum of digits to be zero
        int sum = 0;
        //Take the initial product of digits be unity
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem; // Add digit to sum
            product = product * rem; // Multiply digit to product
            n /= 10; // Remove the last digit
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans); // Output
    }
}
