class Solution {
    public static ListNode reverse(ListNode t){
        ListNode prev = null;
        ListNode curr = t;
        ListNode N = null;
        while(curr!=null){
            N = curr.next;
            curr.next = prev;
            prev = curr;
            curr = N;
        }
        t = prev;
        return t;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            slow=slow.next;
            head=head.next;
        }
        return true;
    }
}
