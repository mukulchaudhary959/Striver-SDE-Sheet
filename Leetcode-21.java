class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t = new ListNode(-1);
        ListNode s = t;
        while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
            s.next=list1;
                list1=list1.next;
                }
                else{
                    s.next=list2;
                    list2=list2.next;
                }
                s=s.next;
            }
        s.next=list1==null?list2:list1;
        return t.next;
    }
}
