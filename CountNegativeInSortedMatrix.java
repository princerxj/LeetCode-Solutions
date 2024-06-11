// Title: Count Negative Numbers in a Sorted Matrix
// Difficulty: Easy
// Tags: Array , Binary Search , Matrix
// URL:  https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class CountNegativeInSortedMatrix {
    public static int countNegatives(int[][] grid) {
        int count = 0 ;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(grid);
        System.out.println(ans); //Output
    }
}
