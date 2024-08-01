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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        ListNode ptr = list2;
        ListNode ans = new ListNode(-1);
        ListNode anss = ans;

        while(temp!=null && ptr!=null){
            if(temp.val==ptr.val){
                ListNode rt = new ListNode(temp.val);
                ans.next = rt;
                ans = ans.next;
                ListNode r = new ListNode(temp.val);
                ans.next = r;
                ans = ans.next;
                temp = temp.next;
                ptr = ptr.next;
            }
            else if(temp.val<ptr.val){
                ListNode rt = new ListNode(temp.val);
                ans.next = rt;
                ans = ans.next;
                temp = temp.next;
            }
            else{
                ListNode rt = new ListNode(ptr.val);
                ans.next = rt;
                ans = ans.next;
                ptr = ptr.next;
            }

        }


        while(temp!=null){
            ListNode rt = new ListNode(temp.val);
            ans.next = rt;
            ans = ans.next;
            temp = temp.next;
        }

        while(ptr!=null){
            ListNode rt = new ListNode(ptr.val);
            ans.next = rt;
            ans = ans.next;
            ptr = ptr.next;
        }

        return anss.next;


    }
}