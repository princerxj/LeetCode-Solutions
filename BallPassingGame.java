// Title: Find the Child Who Has the Ball After K Seconds
// Difficulty: Easy
// Tags: Math , Simulation
// URL: https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/description/
public class BallPassingGame {
    public static int numberOfChild(int n, int k) {
        n--;
        int trips = k / n;
        int rem = k % n;

        if(trips % 2 == 0) {
            return rem;
        } else {
            return (n - rem);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        int ans = numberOfChild(n,k);
        System.out.println(ans);
    }
}
