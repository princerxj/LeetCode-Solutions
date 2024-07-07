// Title: Reverse Integer
// Difficulty: Medium
// Tags: Math
// URL: https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        while(x != 0) {
            int rem = x % 10;
            x = x/10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            reverse = reverse*10 + rem;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int x = 123;
        int ans = reverse(x);
        System.out.println(ans);
    }
}
