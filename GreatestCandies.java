// Title: Kids With the Greatest Number of Candies
// Difficulty: Easy
// Tags: Array
// URL: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.ArrayList;
public class GreatestCandies {
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            int flag = 0;
            int temp = candy + extraCandies;
            for (int i : candies) {
                if (temp < i) {
                    flag = 1;
                    break;
                }
            }
            list.add(flag < 1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int ectraCandies = 3;
        ArrayList<Boolean> list = kidsWithCandies(candies,ectraCandies);
        System.out.println(list);
    }
}
