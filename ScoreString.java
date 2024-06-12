// Title: Score of a String
// Difficulty: Easy
// Tags: String
// URL: https://leetcode.com/problems/score-of-a-string/description/
public class ScoreString {
    public static int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for(int i = 0; i<charArray.length-1; i++) {
            int a = charArray[i];
            int b = charArray[i+1];
            int diff = a-b;
            if(diff>0) {
                sum = sum+diff;
            }
            else {
                sum = sum - diff;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "hello";
        int ans = scoreOfString(s);
        System.out.println(ans);
    }
}
