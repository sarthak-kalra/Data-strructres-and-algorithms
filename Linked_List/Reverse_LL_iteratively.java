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
        if(head==null){
            return head;
        }
        ListNode prev= head;
        ListNode curr = head.next;
        ListNode ahead = head.next;
        while(curr!=null){
          
            ahead=ahead.next;
            curr.next= prev;
            prev = curr;
            curr= ahead;
           
        }
    head.next= null;
       return prev;
    }
}
