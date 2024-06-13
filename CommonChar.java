// Title: Find Common Characters
// Difficulty: Easy
// Tags: Array , Hash Table , String
// URL: https://leetcode.com/problems/find-common-characters/description/
import java.util.ArrayList;
public class CommonChar {
    public static ArrayList<String> commonChars(String[] words) {
        int[] commonCount = new int[26];
        for (char c : words[0].toCharArray()) {
            commonCount[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] currentCount = new int[26];
            for (char c : words[i].toCharArray()) {
                currentCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                commonCount[j] = Math.min(commonCount[j], currentCount[j]);
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < commonCount[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        ArrayList<String> list = commonChars(words);
        System.out.println(list);
    }
}
