// Title: Find Numbers with Even Number of Digits
// Difficulty: Easy
// Tags: Array
// URL: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class NumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            int value = 0;
            while(nums[i]>0) {
                value++;
                nums[i] = nums[i]/10;
            }
            if(value%2==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans); //Output
    }
}
