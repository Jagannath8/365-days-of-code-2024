public class Solution {
    public String fractionToDecimal(int N, int D) {
        long A = N;
        long B = D;
        StringBuilder ans = new StringBuilder();
        if ((A < 0 && B > 0) || (A > 0 && B < 0))
            ans.append("-");
        A = Math.abs(A);
        B = Math.abs(B);
        ans.append(A / B);
        long a = A % B;

        if (a == 0)
            return ans.toString();
        else
            ans.append('.');

        Map<Long, Long> m = new HashMap<>();
        Vector<Long> v = new Vector<>();
        long bk = -1; // To mark the breakpoint of recurring
        while (a > 0) {
            if (!m.containsKey(a)) {
                v.add(a);
                m.put(a, (a * 10) / B);
                a *= 10;
                a %= B;
            } else {
                bk = a;
                break;
            }
        }
        if (a == 0)
            for (long num : v)
                ans.append(m.get(num));
        else {
            for (long num : v) {
                if (num == bk)
                    ans.append('(');
                ans.append(m.get(num));
            }
            ans.append(')');
        }
        return ans.toString();
    }
}
