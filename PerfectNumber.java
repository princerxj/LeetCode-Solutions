// Title: Perfect Number
// Difficulty: Easy
// Tags: Math
// URL: https://leetcode.com/problems/perfect-number/description/
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i =1; i<num; i++) {
            if(num%i==0) {
                sum = sum+i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        boolean ans = checkPerfectNumber(num);
        System.out.println(ans);
    }
}
