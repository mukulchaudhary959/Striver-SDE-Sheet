class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode t = head;
        ListNode s = head;
        while(s!=null && s.next!=null){
            t=t.next;
            s=s.next.next;
          
        }
        return t;
    }
}
