// Title: Pass the Pillow
// Difficulty: Easy
// Tags: Math , Simulation
// URL: https://leetcode.com/problems/pass-the-pillow/description/
public class PillowPass {
    public static int passThePillow(int n, int time) {
        int currentIndex;
        int timePeriod = 2*(n - 1);
        int remainder = time % timePeriod;
        if(remainder < n) {
            currentIndex = remainder + 1;
        } else {
            currentIndex = 2*n - remainder - 1;
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        int ans = passThePillow(n,time);
        System.out.println(ans);
    }
}
