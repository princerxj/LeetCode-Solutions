// Title: Reverse String
// Difficulty: Easy
// Tags: String , Two Pointers
// URL: https://leetcode.com/problems/reverse-string/

public class ReverseString {
    public static void reverse(char[] s) {
        int start = 0;
        int end = s.length -1;
        while(start<end) {
            swap(s,start,end);
            start++;
            end--;
        }
    }
    public static void swap(char[] s, int i1, int i2) {
        char temp = s[i1];
        s[i1] = s[i2];
        s[i2] = temp;
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(s);
    }
}
