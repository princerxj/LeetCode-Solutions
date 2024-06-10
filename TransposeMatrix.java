// Title : Transpose Matrix
// Difficulty: Easy
// Tags: Array , Matrix , Simulation
// URL: https://leetcode.com/problems/transpose-matrix/description/
import java.util.Arrays;

public class TransposeMatrix {
    //Method for transposing the matrix
    public static int[][] transpose(int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix.length; row++) {
            for( int col = 0; col < matrix[row].length;col++) {
                trans[row][col] = matrix[col][row];
            }
        }
        return trans ;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,4,5},{6,7,8},{1,2,3}};
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
}
