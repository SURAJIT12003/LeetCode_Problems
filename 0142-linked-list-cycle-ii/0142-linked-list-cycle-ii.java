/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        ListNode ptr = head;

        while(ptr!=null){
            temp = temp.next;
            if( ptr.next==null || ptr.next.next==null){
                ptr = ptr.next;
                continue;
            }
            ptr = ptr.next.next;
            if(temp==ptr){
                ListNode s  = head;
                ListNode t = ptr;
                while(s!=t){
                    s = s.next;
                    t = t.next;
                }
                return s;
            }
        }
        return null;
    }
}