// Title: Find Smallest Letter Greater Than Target
// Difficulty: Easy
// Tags: Array , Binary Search
// URL: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        while(left <= right ) {
            int mid =  left + (right - left)/2;
            if(target < letters[mid]) {
                right = mid - 1;
            }
            else {
                left = left+1;
            }
        }
        return letters[left%letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
}
