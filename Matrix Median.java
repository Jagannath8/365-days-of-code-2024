public class Solution {
    public int findMedian(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        int low=0, high=Integer.MAX_VALUE;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int cnt=0;
            for(int i=0;i<n;i++){
                cnt+=helper(A[i], mid);
            }
            if(cnt<=(n*m)/2){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
    
    int helper(int a[], int x){
        int low=0;
        int high=a.length-1;
        int temp=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]<x){
                low=mid+1;
                temp=mid+1;
            }
            else
                high=mid-1;
        }
        return temp;
    }
}
