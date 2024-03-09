public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int n = A.size();
        if (n == 1)
            return 0;

        int i = 0;
        int j = n - 1;
        int sum = Integer.MIN_VALUE;

        while (i < j) {
            int h = Math.min(A.get(i), A.get(j));
            int b = j - i;
            int area = h * b;

            if (area > sum) {
                sum = area;
                if (A.get(i) > A.get(j))
                    j--;
                else if (A.get(i).equals(A.get(j))) {
                    i++;
                    j--;
                } else
                    i++;
                continue;
            }

            if (A.get(i) > A.get(j))
                j--;
            else if (A.get(i).equals(A.get(j))) {
                i++;
                j--;
            } else
                i++;
        }
        return sum;
    }
}
