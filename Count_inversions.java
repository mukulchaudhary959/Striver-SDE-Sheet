import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int count=0;
        for(int i=0;i<n;i++){
        int left=i;
        int right=n-1;
        while(left<right){
            if(arr[left]>arr[right]){
               count++; 
            }
            right--;
        }
        }
        return count;
    }
}
