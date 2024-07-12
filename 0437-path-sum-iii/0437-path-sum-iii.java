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

    int count = 0;

    public void rec(TreeNode root, long sum, int target) {
        if (root == null) {
            return;
        }
        sum += root.val;
       
        if (sum == target) {
           // System.out.println(root.val+" "+sum+" "+target);
            count++;
        }

        rec(root.left, sum, target);
        rec(root.right, sum, target);
        sum -= root.val;

    }

    public int all(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        rec(root, 0, target);
        int t = count;
        //System.out.println(root.val+" "+count);
        count = 0;
       
        int l = all(root.left, target);
        int r = all(root.right, target);
        return l + r + t;
    }

    public int pathSum(TreeNode root, int targetSum) {
        return all(root, targetSum);

    }
}