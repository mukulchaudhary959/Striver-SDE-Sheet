class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
            // List<Integer> l = new ArrayList<>();
            if(j==0 || j==i){
                l.add(1);
            }
            else{
                l.add(pre.get(j-1)+pre.get(j));
            }    
        }
            pre=l;
            list.add(l);
        }
        return list;
    }
}
