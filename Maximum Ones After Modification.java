public class Solution {
    public int solve(int[] A, int B) {
        int i=0,j=0;
        int pre=0;
        int ans=0;
        while(i<A.length && j<A.length){
            pre += A[j];
            if((j-i+1) - pre <= B){
                j++;
                ans = Math.max(ans, j-i);
            }
            else{
                i++;
                pre -= A[i-1];
            }
        }
        return ans;
    }
}
