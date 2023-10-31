class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int min=0;
        int max=matrix[0].length-1;
        while(min<matrix.length && max>=0){
            int t = matrix[min][max];
            if(t==target){
                return true;
            }
            else if(t>target){
                max--;
            }
            else{
                min++;
            }
        }
        return false;
    }
}
