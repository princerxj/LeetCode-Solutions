// Title: Minimum Number of Days to Make m Bouquets
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class MinimumDays {
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;

        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
            if (bouquets >= m) return true;
        }
        return bouquets >= m;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int ans = minDays(bloomDay,m,k);
        System.out.println(ans);
    }
}
