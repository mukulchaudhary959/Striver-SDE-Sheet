class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode t = head;
        if(head==null || head.next==null || k==0){
            return head;
        }
        int count=1;
        while(t.next!=null){
            t=t.next;
            count++;
        }
        t.next=head;
        k=k%(count);
        k=count-k;
        ListNode l = head;
        for(int i=0;i<k-1;i++){
            l=l.next;
        }
        head=l.next;
        l.next=null;
        return head;
    }
}
