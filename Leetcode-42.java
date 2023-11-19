class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft=0,maxRight=0;
        int left=0,right=n-1;
        int water=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=maxLeft){
                    maxLeft=height[left];
                }
                else{
                    water+=maxLeft-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=maxRight){
                    maxRight=height[right];
                }
                else{
                    water+=maxRight-height[right];
                }
                right--;
            }
               }
        return water;
    }
}
