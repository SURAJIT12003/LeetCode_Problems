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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode ptr = head;

        while (ptr.next != null) {
            temp = temp.next;

            if (ptr.next.next == null) {
                ptr = ptr.next;
                continue;
            }
            ptr = ptr.next.next;
        }
        return temp;
    }
}