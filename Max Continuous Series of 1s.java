public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        int countZeros = 0;
        int maxLength = 0;
        int maxLeftIndex = 0;
        while (right < A.size()) {
            if (A.get(right) == 0) {
                countZeros++;
            }
            
            while (countZeros > B) {
                if (A.get(left) == 0) {
                    countZeros--;
                }
                left++;
            }
            
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxLeftIndex = left;
            }
            
            right++;
        }
        
        for (int i = maxLeftIndex; i < maxLeftIndex + maxLength; i++) {
            result.add(i);
        }
        
        return result;
    }
}
