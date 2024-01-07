public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] A) {
        int a=1, b=1;
        int n=A.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a==0)
                a=A[i];
            else
                a*=A[i];
            max1=Math.max(max1,a);
        }
        
        for(int i=n-1;i>0;i--){
            if(b==0)
                b=A[i];
            else    
                b*=A[i];
            max2=Math.max(max2,b);
        }
        return Math.max(max1,max2);
    }
}
