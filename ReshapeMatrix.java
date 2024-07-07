// Title: Reshape the Matrix
// Difficulty: Easy
// Tags: Array, Matrix , Simulation
// URL: https://leetcode.com/problems/reshape-the-matrix/description/
import java.util.Arrays;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int nElements = mat.length * mat[0].length;
        if(nElements != r*c) {
            return mat;
        }
        int[] arr = new int[nElements];
        int k = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[k] = ints[j];
                k++;
            }
        }
        int index = 0;
        int[][] newMat = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                newMat[i][j] = arr[index];
                index++;
            }
        }
        return newMat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ans = matrixReshape(mat,r,c);
        System.out.println(Arrays.deepToString(ans));
    }
}
