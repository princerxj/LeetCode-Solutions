// Title: Lucky Numbers in a Matrix
// Difficulty: Easy
// Tags: Array, Matrix
// URL: https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
import java.util.ArrayList;

public class LuckyNumbers {
    public static ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> minList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int[] value : matrix) {
            int min = value[0];
            for (int i : value) {
                if (min > i) {
                    min = i;
                }
            }
            minList.add(min);
        }
        for(int col = 0; col < matrix[0].length; col++) {
            int max = matrix[0][col];
            for (int[] ints : matrix) {
                if (max < ints[col]) {
                    max = ints[col];
                }
            }
            maxList.add(max);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == minList.get(i) && matrix[i][j] == maxList.get(j)) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        ArrayList<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
}
