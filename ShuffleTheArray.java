// Title: Shuffle the Array
// Difficulty: Easy
// Tags: Array
// URL: https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;

public class ShuffleTheArray {
    //Method to shuffle the array
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for(int i = 0; i < n ; i++ ) {
            shuffled[2*i] = nums[i];
            shuffled[(2*i)+1] = nums[i+n];

        }
        return shuffled;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffledarray = shuffle(nums,n);
        System.out.println(Arrays.toString(shuffledarray)); //Output
    }
}
