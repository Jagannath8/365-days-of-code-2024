public class Solution {
    public int[] nextPermutation(int[] A) {
        int n = A.length;
        int i = n - 2;
        while (i >= 0 && A[i] >= A[i + 1]) {
            i--;
        }

        if (i == -1) {
            Arrays.sort(A);
            return A;
        }

        int j = n - 1;
        while (A[j] <= A[i]) {
            j--;
        }

        swap(A, i, j);
        reverse(A, i + 1, n - 1);
        return A;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
