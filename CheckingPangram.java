// Title: Check if the Sentence Is Pangram
// Difficulty: Easy
// Tags: HashTable , String
// URL: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CheckingPangram {
    public static boolean checkIfPangram(String sentence) {
        int flag = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int flag2 = 1;
            for(int i = 0; i < sentence.length(); i++) {
                if(ch == sentence.charAt(i)) {
                    flag2 = 0;
                    break;
                }
            }
            if(flag2 == 1) {
                flag = 1;
                break;
            }
        }
        return flag != 1;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean check = checkIfPangram(sentence);
        System.out.println(check);
    }
}
