// Title: To Lower Case
// Difficulty: Easy
// Tags: String
// URL: https://leetcode.com/problems/to-lower-case/description/
public class ToLowerCase {
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                int c=(int)s.charAt(i)+32;
                sb.setCharAt(i,(char)c);
            }
        }
        s = sb.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }
}
