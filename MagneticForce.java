// Title: Magnetic Force Between Two Balls
// Difficulty: Medium
// Tags: Array , Binary Search , Sorting
// URL: https://leetcode.com/problems/magnetic-force-between-two-balls/description/
import java.util.Arrays;
public class MagneticForce {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0];

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (canPlaceBalls(position, m, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static boolean canPlaceBalls(int[] position, int m, int minForce) {
        int count = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minForce) {
                count++;
                lastPosition = position[i];
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        int ans = maxDistance(position,m);
        System.out.println(ans);
    }
}
