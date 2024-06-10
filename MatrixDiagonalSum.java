// Title: Matrix Diagpnal Sum
// Difficulty: Easy
// Tags: Array , Matrix
// URL: https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    //Method to find Sum of Diagonal Elements
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i] + mat[i][n-i-1];
        }
        if(n % 2 != 0) {
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = diagonalSum(mat);
        System.out.println(ans); //Output
    }
}
