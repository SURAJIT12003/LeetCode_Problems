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
   
    public int  parrent(TreeNode root,int x,int prev){
        if(root==null){
            return -1;
        }

        if(root.val==x){
            return prev;
        }

        int left = parrent(root.left,x,root.val);
        int right= parrent(root.right,x,root.val);
        if(left==-1 && right==-1){
            return -1;
        }

        int t = Math.abs(left-right);
        t+=1;
        return t;
    }

    ArrayList<Integer> arr  = new ArrayList<>();
    public void depth(TreeNode root,int d,int x){
        if(root==null){
            return ;
        }
        d=d+1;
        if(root.val==x){
          arr.add(d);
          return ;
        }
        depth(root.left,d,x);
        depth(root.right,d,x);
        d=d-1;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int p1 = parrent(root,x,-1);
        int p2 = parrent(root,y,-1);
        if(p1==-1 || p2==-1){
            return false;
        }
        if(p1==p2){
            return false;
        }
        depth(root,0,x);
        depth(root,0,y);
        if(arr.get(0)!=arr.get(1)){
            return false;
        }
        return true ;

    }
}