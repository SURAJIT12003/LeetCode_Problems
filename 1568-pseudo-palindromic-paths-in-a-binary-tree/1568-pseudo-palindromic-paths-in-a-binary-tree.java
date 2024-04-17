/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public boolean check(int map[]) {
        int c = 0;
        for (int i = 1; i <= 9; i++) {
            if (map[i] != 0) {
                if (map[i] % 2 != 0 && c == 0) {
                    c = 1;
                } else if (map[i] % 2 != 0 && c != 0) {
                    return false;
                }
            }

        }

        return true;
    }

    int count = 0;

    public int path(TreeNode root, int map[]) {
        if (root == null) {
            return 0;
        }

        map[root.val] = map[root.val] + 1;
        if (root.left == null && root.right == null) {
            int t = 0;
            if (check(map)) {
                t = 1;
            }
            map[root.val] = map[root.val] - 1;
            return t;
        }
        int left = path(root.left, map);
        int right = path(root.right, map);
        map[root.val] = map[root.val] - 1;
        return left+right;

    }

    public int pseudoPalindromicPaths(TreeNode root) {
        int map[] = new int[10];
        return path(root, map);

    }
}