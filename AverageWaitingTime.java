// Title: Average Waiting Time
// Difficulty: Medium
// Tags: Array, Simulation
// URL: https://leetcode.com/problems/average-waiting-time/description/
public class AverageWaitingTime {
    public static double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        double totalTime = 0;
        for (int[] customer : customers) {
            if (currentTime <= customer[0]) {
                totalTime = totalTime + customer[1];
                currentTime = customer[0] + customer[1];
            } else {
                totalTime = totalTime + (currentTime - customer[0]) + customer[1];
                currentTime = currentTime + customer[1];
            }
        }
        return totalTime / customers.length;
    }

    public static void main(String[] args) {
        int[][] custoemrs = {{1,2},{2,5},{4,3}};
        double ans = averageWaitingTime(custoemrs);
        System.out.println(ans);
    }
}
