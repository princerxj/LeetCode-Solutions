// Title: Three Consecutive Odds
// Difficulty: Easy
// Tags: Array
// URL: https://leetcode.com/problems/three-consecutive-odds/description/
public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > 2) {
                break;
            }
        }
        return count > 2;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        boolean ans = threeConsecutiveOdds(arr);
        System.out.println(ans);
    }
}
