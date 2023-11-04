class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] n = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                n[0]=map.get(target-nums[i]);
                n[1]=i;
                return n;
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        return n;
    }
}
