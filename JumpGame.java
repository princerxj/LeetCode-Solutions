// Title: Jump Game
// Difficulty: Medium
// Tags: Array , Greedy , Dynamic Programming
// URL: https://leetcode.com/problems/jump-game/description/
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reach = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > reach) return false;
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean check = canJump(nums);
        System.out.println(check);
    }
}
