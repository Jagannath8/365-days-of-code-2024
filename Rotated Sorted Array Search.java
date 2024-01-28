public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
        int start = 0, end = A.size()-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int midVal = A.get(mid);
            if(midVal == B)
                return mid;
           
            if(A.get(start) > midVal){
                if(B > midVal && B <= A.get(end))
                    start = mid+1;
                else
                    end = mid-1;
            }
            else{ 
                if(B < midVal && B >= A.get(start))
                    end = mid-1;
                else
                    start = mid +1;
            }
        }
        return -1;
    }
}
