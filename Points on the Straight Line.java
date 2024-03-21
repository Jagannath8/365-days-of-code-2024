public class Solution {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = a.size();
        int maxi = 0;
        if (n == 0) 
            return maxi;

        for (int i = 0; i < n; i++) {
            Map<Double, Integer> mp = new HashMap<>();
            int same = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int den = a.get(i) - a.get(j), num = b.get(i) - b.get(j);
                if (den == 0) {
                    same++;
                    maxi = Math.max(maxi, same);
                    continue;
                }
                double slope = (double) num / den;
                Integer count = mp.get(slope);
                mp.put(slope, (count == null ? 0 : count) + 1);
                maxi = Math.max(maxi, mp.get(slope));
            }
        }
        return maxi + 1;
	}
}
