class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int right=0;
        int max=0;
        while(right<s.length()){
            char c = s.charAt(right);
            if(set.add(c)){
                right++;
                max=Math.max(right-left,max);
            }
            else{
                while(s.charAt(left)!=c){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
