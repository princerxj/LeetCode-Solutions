// Title: Crawler Log Folder
// Difficulty: Easy
// Tags: Array, String, Stack
// URL: https://leetcode.com/problems/crawler-log-folder/description/
public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                depth++;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int ans = minOperations(logs);
        System.out.println(ans);
    }
}
