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
        return temp;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode rev = new ListNode(-1);
        ListNode point  = rev;
       

        while(temp!=null){
           ListNode rt = new ListNode(temp.val);
           rev.next = rt ;
           rev = rev.next;
           temp = temp.next;
        }

        ListNode revnode = reverseList(point.next);
        temp = head;
   
        while(temp!=null){
           
            if(temp.val!=revnode.val){
                return false;
            }
            temp = temp.next;
            revnode = revnode.next;
        }
        return true;

       
    }
}