public class Solution {
	public long reverse(long a) {
        long ans = 0;
        int b = 31; 
        while (a != 0) {
            long lsb = a & 1;
            ans |= lsb << b;            
            a >>= 1;
            b--;
        }
        return ans;
	}
}
