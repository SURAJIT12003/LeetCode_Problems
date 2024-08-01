/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode ptr = temp.next;

        while(ptr!=null){
            ListNode nt = ptr.next;
            ptr.next = temp; 
            temp = ptr;
            ptr  = nt;
           
        }
        head.next = null;
        //System.out.println(temp.data);
        return temp;
    }
}