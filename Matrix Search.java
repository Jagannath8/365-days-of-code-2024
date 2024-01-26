public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int rows = A.length;
        if (rows == 0)
            return 0;
        
        int cols = A[0].length;
        if (cols == 0)
            return 0;
        
        int row = 0, col = cols - 1;        
        while (row < rows && col >= 0) {
            int current = A[row][col];
            if (current == B)
                return 1;
            else if (current < B)
                row++; 
            else
                col--; 
        }        
        return 0;
    }
}
