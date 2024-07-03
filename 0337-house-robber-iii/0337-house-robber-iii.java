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
    public int rec(TreeNode root, HashMap<TreeNode,Integer> hs){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.val;
        }
        if(hs.containsKey(root)){
            return hs.get(root);
        }
        int take = root.val;
        if(root.left!=null){
            take = take + rec(root.left.left,hs);
            take = take + rec(root.left.right,hs);
        }
        if(root.right!=null){
            take = take + rec(root.right.right,hs);
            take = take + rec(root.right.left,hs);
        }
            
        int not   = rec(root.left,hs)+rec(root.right,hs);
        hs.put(root,Math.max(take,not));
        return Math.max(take,not);
       
    }
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer> hs = new HashMap<>();
        return rec(root,hs);
    }
}