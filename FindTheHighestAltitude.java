// Title: Find the Highest Altitude
// Difficulty: Easy
// Tags: Array , Prefix Sum
// URL: https://leetcode.com/problems/find-the-highest-altitude/description/
public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        int max = altitudes[0];
        for(int i = 1; i < altitudes.length; i++) {
            altitudes[i] = gain[i-1]+altitudes[i-1];
            if(max<altitudes[i]) {
                max = altitudes[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println(ans); //Output
    }
}
