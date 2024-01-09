public class Solution {
    public int solve(int[] A) {
        int steps=-1;
        int s1=A[0];
        int s2=s1+A[1];
        for(int i=2;i<A.length;i++){
            steps=Math.min(s1,s2)+A[i];
            s1=s2;
            s2=steps;
        }
        return s2;
    }
}
