// Title: Intersection of Two Arrays II
// Difficulty: Easy
// Tags: Array, Hash Table, Two Pointers, Binary Search, Sorting
// URL: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
import java.util.Arrays;
import java.util.ArrayList;
public class IntersectArrII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
}
