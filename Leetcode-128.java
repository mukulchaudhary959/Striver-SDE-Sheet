class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);
        int count=1;
        int max=0;
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
           if(set.contains(nums[i]-1)){
               if(!set.contains(nums[i])){
               count++;
               }
               if(i==nums.length-1){
                   max=Math.max(max,count);
               }
           }
           else{
               max=Math.max(max,count);
               count=1;
           }
           set.add(nums[i]);
       }
        return max;
    }
}
