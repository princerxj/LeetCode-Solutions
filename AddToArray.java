// Title: Add to Array-Form of Integer
// Difficulty: Easy
// Tags: Array, Math
// URL: https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;
        while(i >=0 || k > 0 || carry > 0) {
            int currentDigit = carry;
            if (i >= 0) {
                currentDigit += num[i];
                i--;
            }
            if (k > 0) {
                currentDigit += k % 10;
                k /= 10;
            }
            result.add(currentDigit % 10);
            carry = currentDigit / 10;
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> ans = addToArrayForm(num,k);
        System.out.println(ans);
    }
}
