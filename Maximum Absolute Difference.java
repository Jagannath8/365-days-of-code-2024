public class Solution {
    public int maxArr(int[] A) {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            max_1=Math.max(max_1,A[i]-i);
            max_2=Math.max(max_2,A[i]+i);
            min_1=Math.min(min_1,A[i]-i);
            min_2=Math.min(min_2,A[i]+i);
        }
        int ans = Math.max(max_1 - min_1, max_2 - min_2);
        return ans;
    }
}
