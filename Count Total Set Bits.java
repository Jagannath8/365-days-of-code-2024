public class Solution {
    public int solve(int A) {
        int mod=(int)1e9 + 7;
        long ans=0;
        for(int i=1;i<=A;i++){
            ans+=Integer.bitCount(i);
        }
        return (int)(ans%mod);
    }
}
