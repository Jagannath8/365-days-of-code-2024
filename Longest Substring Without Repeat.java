public class Solution {
    public int lengthOfLongestSubstring(String a) {
        int n = a.length();
        int ans = 0, j = 0;
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(a.charAt(i)) && m.get(a.charAt(i)) >= j) {
                j = m.get(a.charAt(i)) + 1;
            }
            m.put(a.charAt(i), i);
            int x = (i - j) + 1;
            ans = Math.max(ans, x);
        }
        return ans;
    }
}
