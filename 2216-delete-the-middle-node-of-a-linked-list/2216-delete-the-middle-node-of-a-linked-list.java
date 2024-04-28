/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode first = head;
        while (first.next != null) {
            slow = slow.next;
            if (first.next.next == null) {
                first = first.next;
                continue;
            }
            first = first.next.next;
        }
        if (slow.next != null) {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }
        else{
            head.next = null;
        }

        return head;
    }
}