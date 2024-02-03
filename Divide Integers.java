public class Solution {
    public int divide(int A, int B) {
        if(A==-2147483648 && B ==-1) 
            return Integer.MAX_VALUE;
        int div=A/B;
        return div;
    }
}
