// Title: Create Binary Tree From Descriptions
// Difficulty: Medium
// Tags: Array, Hashtable, BinaryTree, Tree
// URL: https://leetcode.com/problems/create-binary-tree-from-descriptions/description/
import java.util.*;

public class CreateBinaryTree {
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            boolean isLeft = description[2] == 1;

            nodes.putIfAbsent(parentVal, new TreeNode(parentVal));
            nodes.putIfAbsent(childVal, new TreeNode(childVal));

            TreeNode parent = nodes.get(parentVal);
            TreeNode child = nodes.get(childVal);

            if (isLeft) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            children.add(childVal);
        }

        TreeNode root = null;
        for (int key : nodes.keySet()) {
            if (!children.contains(key)) {
                root = nodes.get(key);
                break;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[][] descriptions = {{1,2,1},{2,3,0},{3,4,1}};
        TreeNode root1 = createBinaryTree(descriptions);
        printTree(root1);
    }
    private static void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node != null) {
                System.out.print(node.val + " ");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                System.out.print("null ");
            }
        }

        System.out.println();
    }
}
