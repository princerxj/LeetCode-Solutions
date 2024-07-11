// Title: Reverse Substrings Between Each Pair of Parentheses
// Difficulty: Medium
// Tags: String, Stack
// URL: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/
import java.util.Stack;

public class ReverseSubstrings {
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                current.reverse();
                current = stack.pop().append(current);
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s = "(u(love)i)";
        String ans = reverseParentheses(s);
        System.out.println(ans);
    }
}
