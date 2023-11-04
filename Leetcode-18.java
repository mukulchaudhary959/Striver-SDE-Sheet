class Solution {
    //// 163/192 test cases passed for that solution.
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        double a = (double)target;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                // List<Integer> t = new ArrayList<>();
                int k = j+1;
                int l = nums.length-1;
                while(k<l){
                   double sum = (double)nums[i]+(double)nums[j]+(double)nums[k]+(double)nums[l];
                    if(sum==a){
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        if(!list.contains(t)){
                        list.add(t);
                        }
                        k++;
                        l--;
                    }
                    if(sum<a){
                    k++;
                    }
                    if(sum>a){
                    l--;
                    }
                }
            }
        }
        return list;
    }
}
