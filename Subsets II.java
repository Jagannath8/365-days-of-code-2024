public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subsetsWithDup(0, A, new ArrayList<Integer>(), ans);
        return ans;
    }
        
    public void subsetsWithDup(int indx, ArrayList<Integer> A, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=indx; i<A.size(); i++){
            if(i > indx && A.get(i) == A.get(i - 1)) 
                continue;
            list.add(A.get(i));
            subsetsWithDup(i + 1, A, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
