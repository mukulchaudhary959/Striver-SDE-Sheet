public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        Arrays.sort(A);
        int[] b=new int[2];
        for(int i=0;i<A.length-1;i++){
           if(A[i]==A[i+1]){
               b[0]=A[i];
               break;
           }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=i+1){
                b[1]=i+1;
                break;
            }
        }
        return b;
    }
}
