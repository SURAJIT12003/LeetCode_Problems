/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node rec(Node root, ArrayList<Integer> visit,HashMap<Integer,Node>map) {
        if (root == null) {
            return root;
        }
        if(visit.contains(root.val)){
            return map.get(root.val);
        }
        Node new_Node = new Node(root.val);
        map.put(root.val,new_Node);

        visit.add(root.val);
       
        List<Node> neigh = root.neighbors;
        for (int i = 0; i < neigh.size(); i++) {
           
            
                Node nn = rec(neigh.get(i), visit , map);
                new_Node.neighbors.add(nn);
                
            

        }
       // visit.remove(visit.size()-1);
        return new_Node;
        
    }

    public Node cloneGraph(Node node) {
        ArrayList<Integer> visit = new ArrayList<>();

        return rec(node, visit ,new HashMap<Integer,Node>());
    }
}