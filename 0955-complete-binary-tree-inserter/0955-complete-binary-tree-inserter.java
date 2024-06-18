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
class CBTInserter {

    TreeNode root = new TreeNode();
    public CBTInserter(TreeNode head) {
        root = head;
    }
    
    public int insert(int val) {
     TreeNode newNode = new TreeNode(val);
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      int parrent = 0;

      while(!q.isEmpty()){
        TreeNode curr = q.poll();
        if(curr.left==null){
            curr.left = newNode;
            parrent = curr.val;
            break;
        }
        else{
            q.add(curr.left);
        }

        if(curr.right==null){
            parrent = curr.val;
            curr.right = newNode;
            break;
        }
        else{
            q.add(curr.right);
        }
      }  

      return parrent;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */