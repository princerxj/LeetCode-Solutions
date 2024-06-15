// Title: Spiral Matrix
// Difficulty: Medium
// Tags: Array , Matrix , Simulation
// URL: https://leetcode.com/problems/spiral-matrix/description/
import java.util.ArrayList;
public class SpiralMatrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0, right = c - 1;
        int top = 0, bottom = r - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }
}
