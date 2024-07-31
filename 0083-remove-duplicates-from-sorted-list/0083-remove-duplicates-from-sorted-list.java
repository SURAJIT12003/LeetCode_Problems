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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp!=null){
            ListNode ptr = temp.next;
            while(ptr!=null && temp.val==ptr.val){
                ptr = ptr.next;
            }
            temp.next = ptr;
            //if(ptr!=null){
                temp = temp.next;
            //}
        }
        return head;
    }
}