public class Solution {
    public int[] subUnsort(int[] A) {
        int n = A.length;
        int start = 0;
        int end = n - 1;
        while (start < n - 1 && A[start] <= A[start + 1]) {
            start++;
        }

        if (start == n - 1) {
            return new int[]{-1};
        }

        while (end > 0 && A[end] >= A[end - 1]) {
            end--;
        }

        int min = A[start];
        int max = A[end];
        for (int i = start; i <= end; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        while (start > 0 && A[start - 1] > min) {
            start--;
        }
        while (end < n - 1 && A[end + 1] < max) {
            end++;
        }

        return new int[]{start, end};
    }
}
