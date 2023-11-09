public class Solution {
    public ListNode detectCycle(ListNode head) {
        int pos=0;
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode t = head;
        if(t==null){
            return null;
        }
        while(t!=null){
            if(map.containsKey(t)){
                return t;
            }
            else{
                map.put(t,pos++);
            }
            t=t.next;
        }
        return null;
    }
}
