/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 =0;
        int len2 = 0;
        ListNode temp = headA;
        ListNode ptr = headB;
        while(temp!=null){
            len1++;
            temp = temp.next;
        }

        while(ptr!=null){
            len2++;
            ptr = ptr.next;
        }

        temp = headA;
        ptr = headB;

        if(len1>len2){
            while(len1!=len2){
                len1--;
                temp =temp.next;
            }
        }
        else{
            while(len1!=len2){
                len2--;
                ptr = ptr.next;
            }
        }

        while(temp!=null && ptr!=null){
            if(temp==ptr){
                return temp;
            }
            temp = temp.next;
            ptr = ptr.next;
        }

        return null;


    }
}