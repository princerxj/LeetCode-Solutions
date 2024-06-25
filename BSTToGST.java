// Title: Binary Search Tree to Greater Sum Tree
// Difficulty: Medium
// Tags: Tree, DFS, BST, Binary Tree
// URL: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BSTToGST {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        // Example tree creation and conversion
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        BSTToGST solution = new BSTToGST();
        root = solution.convertBST(root);

        printInOrder(root);  // This should print the Greater Tree in in-order traversal
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}
