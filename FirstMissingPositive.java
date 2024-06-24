// Title: First Missing Positive
// Difficulty: Hard
// Tags: Array, HashTable
// URL: https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }
}
