// Title: Concatenation of Array
// Difficulty: Easy
// Tags: Array , Simulation
// URL: https://leetcode.com/problems/concatenation-of-array/description/
import java.util.Arrays;

public class ConcatenationOfArray {
    //Method for obtaining concatenated Array
    public static int[] getConcatenation(int[] nums) {
        int[] concarray = new int[2 * nums.length];
        for(int i = 0; i < concarray.length; i++) {
            if (i < nums.length) {
                concarray[i] = nums[i];
            }
            else {
                concarray[i] = nums[i-nums.length];
            }
        }
        return concarray;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans)); //Output
    }
}
