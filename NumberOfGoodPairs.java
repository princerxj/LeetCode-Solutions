// Title: Number of Good Pairs
// Difficulty: Easy
// Tags: Array , Hash Table , Math , Counting
// URL: https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    //Nethod for counting good pairs
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length-1;i++) {
            for(int j = 0; j<nums.length;j++) {
                if(j>i) {
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println("The number of good pairs in the given array is : "+ans); //Output
    }
}
