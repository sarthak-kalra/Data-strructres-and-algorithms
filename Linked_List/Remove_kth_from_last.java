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
  
  // ONE PASS SOLUTION MOVE FAST POINTER TO K STEPS
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(head.next==null&&n==1){
            return head.next;
        }
        
        ListNode temp = head;
      int i = 1;
       while(i<=n&&temp!=null){
           temp=temp.next;
           i++;
       }
        if(temp==null){
            head= head.next;
        }
        else{
            ListNode curr = head;
        while(temp.next!=null){
            curr=curr.next;
            temp=temp.next;
        }
            curr.next=curr.next.next;
            
        }
 return head;
        
    }
  
  // THIS IS THE TWO PASS SOLUTION .. FIRST WE FIND SIZE
  
   public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(head.next==null&&n==1){
            return head.next;
        }
        
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
      //  System.out.println(size);
        
        n = size-n;
        temp = head;
        if(n==0){
            head = head.next;
        }
        else{
        while(n!=1&&temp!=null){
            temp = temp.next;
            n=n-1;
        }
     
        temp.next=temp.next.next;
            
        }
       
        
        
        
        
       return head;
        
    }
}
