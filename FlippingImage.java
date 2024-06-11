import java.util.Arrays;

// Title: Flipping an image
// Difficulty: Easy
// Tags: Array , Two Pointers , Bit Manipulation , Matrix , Simulation
// URL: https://leetcode.com/problems/flipping-an-image/description/
public class FlippingImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] flipinv = new int[image.length][image[0].length];
        for(int row = 0; row < image.length;row++) {
            for(int col = 0; col<image[0].length; col++) {
                flipinv[row][col] = image[row][image[0].length-col-1];
            }
        }
        for(int row = 0; row < image.length;row++) {
            for(int col = 0; col<image[0].length; col++) {
                if(flipinv[row][col] == 0) {
                    flipinv[row][col] = 1;
                }
                else {
                    flipinv[row][col] = 0;
                }
            }
        }
        return flipinv;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }
}
