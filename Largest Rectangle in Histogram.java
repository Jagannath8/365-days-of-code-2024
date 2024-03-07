public class Solution {
    public int largestRectangleArea(int[] A) {
        LinkedList < Integer > stack = new LinkedList < > ();
        int maxi = 0;
        for (int i = 0; i <= A.length; i++) {
            while (!stack.isEmpty() && (i == A.length || A[stack.peek()] > A[i])) {
                int height = A[stack.pop()];
                int width = (!stack.isEmpty()) ? i - stack.peek() - 1 : i;
                maxi = Math.max(maxi, height * width);
            }
            stack.push(i);
        }
        return maxi;
    }
}
