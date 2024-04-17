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
    public void rec(TreeNode root,HashMap<Integer,Integer> hs){
        if(root==null){

            return ;
        }
        int t = root.val;
        if(hs.containsKey(t)){
            hs.put(t,hs.get(t)+1);
        }
        else{
            hs.put(t,1);
        }

        rec(root.left,hs);
        rec(root.right,hs);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        rec(root,hs);

        ArrayList<Integer> ans = new ArrayList<>();
        int max =0;
        for(int v:hs.keySet()){
            max = Math.max(hs.get(v),max);
        }

         for(int v:hs.keySet()){
           if(max==hs.get(v)){
            ans.add(v);
           }
        }

        int ss[] = new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            ss[i] = ans.get(i);
        }

        return ss;
    }
}