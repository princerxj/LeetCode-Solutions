// Title: Valid Perfect Square
// Difficulty: Easy
// Tags: Math , Binary Search
// URL: https://leetcode.com/problems/valid-perfect-square/description/
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 1 || num == 0) {
            return true;
        }
        for(long i = 2; i<=num/2; i++) {
            if(num == i*i) {
                return true ;
            }
            if(num < i*i) {
                return false ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        boolean ans = isPerfectSquare(num);
        System.out.println(ans);
    }
}
