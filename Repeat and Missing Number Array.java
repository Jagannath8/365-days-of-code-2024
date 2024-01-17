public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int [] repeatedNumber(final int[] A) {
        int []out=new int[2];
        int n=A.length;
        int[] temp= new int[n]; 
        int repeatingNumber = -1;
        int missingNumber = -1;
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            temp[A[i] - 1]++;
            if (temp[A[i] - 1] > 1) {
                repeatingNumber = A[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }
        out[0]=repeatingNumber;
        out[1]=missingNumber;
        return out;
    }
}
