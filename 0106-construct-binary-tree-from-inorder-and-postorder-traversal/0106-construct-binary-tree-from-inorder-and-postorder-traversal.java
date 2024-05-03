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
    int find(int data, HashMap<Integer, Integer> hs) {
        return hs.get(data);
    }

    int index = 0;

    TreeNode create(int in[], int pre[], int n, int inordstart, int inordend, HashMap<Integer, Integer> hs) {
        if (index < 0 || inordstart > inordend) {
            return null;
        }
        int data = pre[index--];

        TreeNode root = new TreeNode(data);
        int pos = find(data, hs);
      
        root.right = create(in, pre, n, pos + 1, inordend, hs);
       
        root.left = create(in, pre, n, inordstart, pos - 1, hs);
      
     
        return root;

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr.put(inorder[i], i);
        }
        index = inorder.length-1;
        return create(inorder, postorder, n, 0, n - 1, arr);
    }
}