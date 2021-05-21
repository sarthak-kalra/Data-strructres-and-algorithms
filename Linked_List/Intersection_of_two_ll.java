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
     int count1 = 0;
        int count2 =0;
        ListNode first = headA;
        ListNode sec = headB;
        while(first!=sec){
           
            if(count1>1&&count2>1){
                return null;
            }
            if(first.next==null){
                first = headB;
                count1++;
            }
            else{
                first= first.next;
            }
            if(sec.next==null){
                sec = headA;
                count2++;
            }else{
                sec= sec.next;
            }
        }
        return first;
        
    }
}
