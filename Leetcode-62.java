class Solution {
    int count=0;
    public int uniquePaths(int m, int n) {

        double t =1;
        for(int i=1;i<m;i++){
            t=t*(n-1+i)/i;
        }
        return (int)t;
    }
}
