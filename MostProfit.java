// Title: Most Profit Assigning Work
// Difficulty: Medium
// Tags: Array, Two Pointers, Binary Search, Greedy, Sorting
// URL: https://leetcode.com/problems/most-profit-assigning-work/description/
import java.util.Arrays;
public class MostProfit {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];
        for(int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int maxprofit = 0, i = 0, best = 0;
        for(int ability : worker) {
            while( i < n && ability >= jobs[i][0]) {
                best = Math.max(best, jobs[i][1]);
                i++;
            }
            maxprofit += best;
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] difficulty = {2,4,6,8,10};
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        int ans = maxProfitAssignment(difficulty,profit,worker);
        System.out.println(ans);
    }
}
