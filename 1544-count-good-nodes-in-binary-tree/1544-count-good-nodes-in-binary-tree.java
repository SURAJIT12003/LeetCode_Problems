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
    public int rec(TreeNode root,int max){
        if(root==null){
            return 0;
        }
        int total =0;
        if(root.val>=max){
            max = root.val;
            total =1; 
        }
        int left =rec(root.left,max);
        int right = rec(root.right,max);
        return left+right+total;

        
    }
    public int goodNodes(TreeNode root) {
        return rec(root,root.val);
    }
}