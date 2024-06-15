// Title: Create Target Array in the Given Order
// Difficulty: Easy
// Tags: Array , Simulation
// URL: https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>(3);
        for(int i = 0; i < index.length; i++) {
            int indextemp = index[i];
            int element = nums[i];
            list.add(indextemp,element);
        }
        Integer[] integerArray = new Integer[list.size()];
        integerArray = list.toArray(integerArray);
        int[] intArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
}
