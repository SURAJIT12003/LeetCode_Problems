/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public void rec(ArrayList<Integer> ans,Node head){
        if(head==null){
            return ;
        }
        ans.add(head.val);
        if(head.child!=null){
            rec(ans,head.child);
        }
        rec(ans,head.next);
    }
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        rec(ans,head);
        Node newnode = new Node(-1);
        Node point = newnode;
        
        for(int i=0;i<ans.size();i++){
            int t = ans.get(i);
            Node rt = new Node(t);
            newnode.next = rt;
            newnode.child = null;
            rt.prev = newnode;
            newnode = newnode.next;
        }
        // System.out.println(point.val);
       
        point = point.next;
        point.prev = null;
        return point;
    }
}