// Title: Robot Collisions
// Difficulty: Hard
// Tags: Array, Stack, Sorting, Simulation
// URL: https://leetcode.com/problems/robot-collisions/description/
import java.util.*;

public class RobotCollisions {
    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Robot[] robots = new Robot[n];

        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
        }

        Arrays.sort(robots, Comparator.comparingInt(r -> r.position));

        Deque<Robot> stack = new ArrayDeque<>();

        for (Robot robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek().direction == 'R') {
                    Robot top = stack.peek();
                    if (top.health < robot.health) {
                        robot.health--;
                        stack.pop();
                    } else if (top.health > robot.health) {
                        top.health--;
                        robot.health = 0;
                        break;
                    } else {
                        stack.pop();
                        robot.health = 0;
                        break;
                    }
                }
                if (robot.health > 0) {
                    stack.push(robot);
                }
            }
        }

        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (Robot robot : stack) {
            result[robot.index] = robot.health;
        }

        List<Integer> survivors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (result[i] != -1) {
                survivors.add(result[i]);
            }
        }

        return survivors;
    }

    static class Robot {
        int position;
        int health;
        char direction;
        int index;

        Robot(int position, int health, char direction, int index) {
            this.position = position;
            this.health = health;
            this.direction = direction;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] positions = {5,4,3,2,1};
        int[] healths = {2,17,9,15,10};
        String directions = "RRRRR";
        List<Integer> ans = survivedRobotsHealths(positions,healths,directions);
        System.out.println(ans);
    }
}
