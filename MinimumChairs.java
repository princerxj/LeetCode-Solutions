// Title: Minimum Number of Chairs in a Waiting Room
// Difficulty: Easy
// Tags: String , Simulationhttps://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/description/
// URL:
public class MinimumChairs {
    public static int minimumChairs(String s) {
        int current = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'E') {
                current++;
            } else if(s.charAt(i) == 'L') {
                current--;
            }
            if(max < current) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "EEEEEEE";
        int ans = minimumChairs(s);
        System.out.println(ans);
    }
}
