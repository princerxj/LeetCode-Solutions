// Title: Cells with Odd Values in a Matrix
// Difficulty: Easy
// Tags: Array, Math , Simulation
// URL: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class CellsWithOddValues {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i = 0; i < n; i++) {
            for (int[] index : indices) {
                mat[index[0]][i]++;
            }
        }
        for(int i =0; i < m; i++) {
            for (int[] index : indices) {
                mat[i][index[1]]++;
            }
        }
        int count = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        int ans = oddCells(m,n,indices);
        System.out.println(ans);
    }
}
