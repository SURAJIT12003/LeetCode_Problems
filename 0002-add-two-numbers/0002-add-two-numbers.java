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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode ans = null;
        ListNode temp = ans;
        int carry = 0;
        while (t1 != null && t2 != null) {
            int t = t1.val + t2.val;
            int data = carry + t;
            carry = data / 10;
            data = data % 10;
            ListNode newNode = new ListNode(data);
           
            if (ans == null) {
                ans = newNode;
                temp = ans;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

       

        while (t1 != null) {
            int t = t1.val;
            int data = carry + t;
            carry = data / 10;
            data = data % 10;
            ListNode newNode = new ListNode(data);
            
            if (ans == null) {
                ans = newNode;
                temp = ans;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            t1 = t1.next;
        }

        while (t2 != null) {
            int t = t2.val;
            int data = carry + t;
            carry = data / 10;
            data = data % 10;
            ListNode newNode = new ListNode(data);

            if (ans == null) {
                ans = newNode;
                temp = ans;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            t2 = t2.next;
        }
        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }

        return ans;

    }
}