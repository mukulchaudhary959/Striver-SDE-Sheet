class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current = head;
        while(current!=null){
            ListNode t = current.next;
            current.next=prev;
            prev=current;
            current=t;
        }
        return prev;
    }
}
