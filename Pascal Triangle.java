public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        for(int i=0;i<A;i++){
            cur.add(0,1);
            for(int j=1;j<cur.size()-1;j++){
                cur.set(j, cur.get(j) + cur.get(j+1));
            }
            output.add(new ArrayList<>(cur));
        }
        return output;
    }
}
