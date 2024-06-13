// Title: Append Characters to String to Make Subsequence
// Difficulty: Medium
// Tags: Two Pointers , String , Greedy
// URL: https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/
public class AppendCharToString {
    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int lenS = s.length();
        int lenT = t.length();

        while (i < lenS && j < lenT) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return lenT - j;
    }

    public static void main(String[] args) {
        String s = "coaching";
        String l = "coding";
        int ans = appendCharacters(s,l);
        System.out.println(ans);
    }
}
