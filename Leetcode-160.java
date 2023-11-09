public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while(headA!=null){
            ListNode t = headB;
        while(t!=null){
if(headA==t){
    return t;
}
t=t.next;
        }
        headA=headA.next;
        }
        return headA;
    }
}
