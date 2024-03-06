public class Solution {
    public String solve(String A) {
        int[] v = new int[26];
        Arrays.fill(v, 0);
        StringBuilder b = new StringBuilder();
        int i = 0;
        for (int j = 0; j < A.length(); j++) {
            v[A.charAt(j) - 'a']++; 
            while (i <= j) {
                if (v[A.charAt(i) - 'a'] == 1) {
                    b.append(A.charAt(i));
                    break;
                } else {
                    i++;
                }
            }
            
            if (b.length() == j) {
                b.append('#');
            }
        }
        return b.toString();
    }
}
