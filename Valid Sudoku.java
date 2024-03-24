public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curr = A[i].charAt(j);
                if (curr != '.') {
                    int num = curr - '0';
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if (((rows[i] >> num) & 1) == 1 ||
                        ((cols[j] >> num) & 1) == 1 ||
                        ((boxes[boxIndex] >> num) & 1) == 1)
                        return 0;

                    rows[i] |= 1 << num;
                    cols[j] |= 1 << num;
                    boxes[boxIndex] |= 1 << num;
                }
            }
        }
        return 1;
    }
}
