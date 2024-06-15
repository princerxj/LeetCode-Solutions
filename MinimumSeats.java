// Title: Minimum Number of Moves to Seat Everyone
// Difficulty: Easy
// Tags: Array , Greedy , Sorting
// URL: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
import java.util.Arrays;
public class MinimumSeats {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);
        }
        return totalMoves;
    }

    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int min = minMovesToSeat(seats,students);
        System.out.println(min);
    }
}
