public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode t = head;
        while(t!=null){
            if(set.contains(t)){
                return true;
            }
            else{
                set.add(t);
            }
            t=t.next;
        }
        return false;
    }
}
