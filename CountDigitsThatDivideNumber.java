// Title: Count the Digits That Divide a Number
// Difficulty: Easy
// Tags: Math
// URL: https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class CountDigitsThatDivideNumber {
    // Method to count the digits of num that divide num
    public static int countDigits(int num) {
        int temp = num , count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem != 0 && temp % rem == 0) {
                count++;
            }
            num /= 10; // removing the last digit
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 1248;
        int ans = countDigits(num);
        System.out.println(ans); //Output
    }
}
