class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode t = new ListNode(0);
       ListNode curr = t;
        int temp=0;
        while(l1!=null || l2!=null || temp==1){
            int sum=0;
           if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
                }
                if(l2!=null){
                    sum+=l2.val;
                    l2=l2.next;
                }
                sum+=temp;
                temp=sum/10;
                ListNode l = new ListNode(sum%10);
                curr.next=l;
                curr=curr.next;
           }
           return t.next;
        }
    
}
