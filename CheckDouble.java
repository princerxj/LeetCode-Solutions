// Title: Check If N and Its Double Exist
// Difficulty: Easy
// Tags: Array , Hash Table , Two Pointers ,  Binary Search , Sorting
// URL: https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class CheckDouble {
    public static boolean checkIfExist(int[] arr) {
        for(int i =0; i<arr.length; i++) {
            for(int j = 0; j<i; j++) {
                if(arr[i] == 2*arr[j]) {
                    return true;
                }
            }
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] == 2*arr[j]) {
                    return true ;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
}
