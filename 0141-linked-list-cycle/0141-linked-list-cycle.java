/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
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
                return true;
            }
        }
        return false;
    }
}