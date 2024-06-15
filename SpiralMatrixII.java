// Title: Spiral Matrix II
// Difficulty: Medium
// Tags: Array , Matrix , Simulation
// URL: https://leetcode.com/problems/spiral-matrix-ii/description/
import java.util.Arrays;
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int i = 1;
        while(top <= bottom && left <= right) {
            for(int j = left; j <= right; j++) {
                matrix[top][j] = i;
                i++;
            }
            top++;
            for(int j = top; j <= bottom; j++) {
                matrix[j][right] = i;
                i++;
            }
            right--;
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    matrix[bottom][j] = i;
                    i++;
                }
                bottom--;
            }
            if(left <= right) {
                for(int j = bottom; j >= top; j--) {
                    matrix[j][left] = i;
                    i++;
                }
                left++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(n);
        System.out.println(Arrays.deepToString(ans));
    }
}
