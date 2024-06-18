// Title: H-Index II
// Difficulty: Medium
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/h-index-ii/description/
public class HIndexII {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int start = 0;
        int end = n - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(citations[mid] < n - mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return n-start ;
    }

    public static void main(String[] args) {
        int[] citations = {0,1,2,3,5,6};
        int ans = hIndex(citations);
        System.out.println(ans);
    }
}
