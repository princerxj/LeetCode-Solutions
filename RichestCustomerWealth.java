// Title: Richest Customer Wealth
// Difficulty: Easy
// Tags: Array , Matrix
// URL: https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    //Method to find maximum wealth
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = { {1,5,8}, {3,2,9},{3,5,10}};
        int ans = maximumWealth(accounts);
        System.out.println("Maximum wealth : "+ans);
    }
}
