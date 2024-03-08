public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n = A.length;
        int ans=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && A[i]>A[s.peek()]){
                int top = s.pop();
                if(s.isEmpty()){
                    break;
                }
                int distance = i - s.peek()-1;
                int bounded_length = Math.min(A[i] , A[s.peek()]) - A[top];
                ans = ans+(distance*bounded_length);
            }
            s.push(i);
        }
        return ans;
    }
}
