// Title: Number Of Atoms
// Difficulty: Hard
// Tags: HashTable, String, Stack, Sorting
// URL: https://leetcode.com/problems/number-of-atoms/description/
import java.util.*;

public class NumberOfAtoms {
    public static String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int i = 0;

        while (i < n) {
            char c = formula.charAt(i);
            if (c == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (c == ')') {
                Map<String, Integer> top = stack.pop();
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                for (String key : top.keySet()) {
                    int count = top.get(key);
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + count * multiplicity);
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                stack.peek().put(name, stack.peek().getOrDefault(name, 0) + count);
            }
        }

        Map<String, Integer> finalCount = stack.pop();
        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList<>(finalCount.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            sb.append(key);
            int count = finalCount.get(key);
            if (count > 1) sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countOfAtoms("H2O")); // "H2O"
        System.out.println(countOfAtoms("Mg(OH)2")); // "H2MgO2"
        System.out.println(countOfAtoms("K4(ON(SO3)2)2")); // "K4N2O14S4"
    }
}
