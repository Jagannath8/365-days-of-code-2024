public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int a : A) {
                a >>= i;
                if ((a & 1) == 1) 
                    bitCount++;
            }

            if (bitCount != 0) {
                int bitRem = bitCount % 3;
                ans += Math.pow(2, i) * bitRem;
            }
        }
        return ans;
    }
}
