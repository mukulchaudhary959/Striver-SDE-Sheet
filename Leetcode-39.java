class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0,candidates,target,list,new ArrayList<>());
        return list;
    }
    public void helper(int index,int[] nums,int target,List<List<Integer>> list,List<Integer> l){
        if(index==nums.length){
            if(target==0){
                list.add(new ArrayList<>(l));
            }
            return;
        }
        if(nums[index]<=target){
            l.add(nums[index]);
            helper(index,nums,target-nums[index],list,l);
            l.remove(l.size()-1);
        }
        helper(index+1,nums,target,list,l);  
    }
}
