class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null&&fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.val);
        ListNode head2 = reverse(slow.next);
        slow.next= null;
        ListNode first = head;
        ListNode second = head2;
        
        while(first!=null&&second!=null){
            ListNode retain = first.next;
            first.next = second;
            ListNode retain2 = second.next;
            second.next= retain;
            first = retain;
            second = retain2;
        }
        
        
}
    public ListNode reverse(ListNode temp){
        if(temp==null||temp.next==null){
            return temp;
        }
        ListNode ret = reverse(temp.next);
        ListNode curr = temp;
        curr.next.next=curr;
        curr.next=null;
        
        return ret;
    }
}
