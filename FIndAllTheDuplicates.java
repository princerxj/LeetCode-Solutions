// Title: Find All Duplicates in an Array
// Difficulty: Medium
// Tags: Array, HashTable
// URL: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class FIndAllTheDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                list.add(nums[index]);
            }
        }
        return list;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = (ArrayList<Integer>) findDuplicates(nums);
        System.out.println(ans);
    }
}
