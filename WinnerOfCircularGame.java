// Title: Find the Winner of the Circular Game
// Difficulty: Medium
// Tags: Array, Math, Recursion, Queue, Simulation
// URL: https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/
public class WinnerOfCircularGame {
    public static int findTheWinner(int n, int k) {
        boolean[] friends = new boolean[n];
        int remaining = n;
        int index = 0;

        while (remaining > 1) {
            int count = 0;
            while (count < k) {
                if (!friends[index]) {
                    count++;
                }
                if (count == k) {
                    friends[index] = true;
                    remaining--;
                }
                index = (index + 1) % n;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!friends[i]) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int ans = findTheWinner(n,k);
        System.out.println(ans);
    }
}
