class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        helper(0,s,list,l);
        return list;
    }
    public void helper(int index,String s,List<List<String>> list,List<String> l){
        if(index==s.length()){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(isPal(s,index,i)){
                l.add(s.substring(index,i+1));
                helper(i+1,s,list,l);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isPal(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
