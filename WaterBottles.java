// Title: Water Bottles
// Difficulty: Easy
// Tags: Math , Simulation
// URL: https://leetcode.com/problems/water-bottles/description/
public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles;
        int drink = 0, rem = 0;
        do {
            drink = drink + numBottles;
            emptyBottles = numBottles + rem;
            rem = emptyBottles % numExchange;
            numBottles = (emptyBottles / numExchange);
        } while(emptyBottles >= numExchange);
        return drink;
    }

    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        int ans = numWaterBottles(numBottles,numExchange);
        System.out.println(ans);
    }
}
