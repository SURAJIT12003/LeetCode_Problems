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
    public ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode(-1);
        ListNode point = ans;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                ListNode rt = new ListNode(temp.val);
                ans.next = rt;
                ans = ans.next;
            }
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            if(temp.val>=x){
                ListNode rt = new ListNode(temp.val);
                ans.next = rt;
                ans = ans.next;
            }
            temp  = temp.next;
        }

        return point.next;
    }
}