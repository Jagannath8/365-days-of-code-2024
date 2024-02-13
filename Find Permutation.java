public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int i=1;
        int j=B;
        ArrayList<Integer> ans = new ArrayList<>();
        for (char it : A.toCharArray()) {
            if (it == 'I')
                ans.add(i++);
            else
                ans.add(j--);
        }

        ans.add(j);
        return ans;
    }
}
