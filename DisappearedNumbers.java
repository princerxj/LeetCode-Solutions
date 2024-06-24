// Title: Find All Numbers Disappeared in an Array
// Difficulty: Easy
// Tags: Array, HashTable
// URL: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while ( i < nums.length) {
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
                list.add(index+1);
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
        ArrayList<Integer> ans = (ArrayList<Integer>) findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
