lass Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode l = head;
        int count=0;
        while(l!=null){
            l=l.next;
            count++;
        }
        if(k>count){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode t=curr.next;
        int a=0;
        while(a<k){
            t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
            a++;
        }
        if(t!=null){
            head.next=reverseKGroup(t,k);
        }
        return prev;
    }
}
