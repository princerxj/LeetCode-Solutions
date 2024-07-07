// Title: Water Bottles II
// Difficulty: Medium
// Tags: Math , Simulation
// URL: https://leetcode.com/problems/water-bottles-ii/description/
public class WaterBottlesII {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = numBottles;
        int bottlesDrunk = 0;
        int emptyBottles = 0;
        do {
            bottlesDrunk = bottlesDrunk + fullBottles;
            emptyBottles = emptyBottles + fullBottles;
            fullBottles = 0;
            if(emptyBottles / numExchange != 0) {
                emptyBottles = emptyBottles - numExchange;
                fullBottles++;
                numExchange++;
            }
        } while(fullBottles != 0 || (emptyBottles / numExchange) != 0);
        return bottlesDrunk;
    }

    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        int ans = maxBottlesDrunk(numBottles,numExchange);
        System.out.println(ans);
    }
}
