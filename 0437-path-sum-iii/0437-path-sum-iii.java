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

    int ans =0;
    long sum=0;
    public void count(TreeNode root,int target){
        if(root==null){
            return  ;
        }
        sum=sum+root.val;
        if(sum==target){
            ans++;
        }
        count(root.left,target);
        count(root.right,target);
        sum=sum-root.val;
        
    }



    public void in(TreeNode root,int target){
        if(root==null){
            return ;
        }
        
        count(root,target);
        //System.out.println(sum);
        in(root.left,target);
        in(root.right,target);
    }
    public int pathSum(TreeNode root, int target) {
        in(root,target);
        return ans ;
    }
}