/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {

    // Helper function to check the maximum path sum from root to leaf
    private int check(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = check(root.left);
        int right = check(root.right);
        if (left != Integer.MIN_VALUE) {
            left += root.val;
        }
        if (right != Integer.MIN_VALUE) {
            right += root.val;
        }
        return Math.max(left, right);
    }

    // Recursive function to mark insufficient nodes
    private boolean rec(TreeNode root, int sum, int limit) {
        if (root == null) {
            return false;
        }

        sum += root.val;
        
        if (root.left == null && root.right == null) {
            return sum >= limit;
        }

        boolean leftSufficient = rec(root.left, sum, limit);
        boolean rightSufficient = rec(root.right, sum, limit);

        if (!leftSufficient) {
            root.left = null;
        }
        if (!rightSufficient) {
            root.right = null;
        }

        return leftSufficient || rightSufficient;
    }

    // Helper function to delete nodes with value -1
    private TreeNode delete(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = delete(root.left);
        root.right = delete(root.right);

        if (root.val == -1) {
            return null;
        }

        return root;
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (rec(root, 0, limit)) {
            return root;
        }
        return null;
    }
}