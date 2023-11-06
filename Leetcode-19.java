class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
       ListNode start = new ListNode();
        start.next=head;
        ListNode s = start;
        ListNode f = head;
        while(n>0 && f!=null){
            f=f.next;
            n-=1;
        }
        while(f!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return start.next;
    }
}
