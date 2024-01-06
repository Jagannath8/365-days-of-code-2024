public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lis(final int[] A) {
        int ans[]=new int[A.length];
        for(int i=1;i<A.length;i++){
            for(int j=0;j<i;j++){
                if(A[i]>A[j]){
                    if(ans[j]+1>ans[i])
                        ans[i]=ans[j]+1;
                }
            }
        }

        int maxi=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>ans[maxi])
                maxi=i;
        }
        return ans[maxi]+1;
    }
}
