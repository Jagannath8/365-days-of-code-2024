public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        Set<ArrayList<Integer>> sol=new LinkedHashSet<>();
        ArrayList<Integer> temp=new ArrayList<>();
        helper(A,B,sol,temp,0);
        ArrayList<ArrayList<Integer>> ansfinal=new ArrayList<>();
        for(ArrayList<Integer> i:sol){
            ansfinal.add(i);
        }
        return ansfinal;
    }

    private void helper(ArrayList<Integer> a, int b, Set<ArrayList<Integer>> sol, ArrayList<Integer> temp,int i) {
        if(i>=a.size()||b<0)
            return;
        if(b==0){
            sol.add(new ArrayList<>(temp));
            return;
        }
        temp.add(a.get(i));
        helper(a, b-a.get(i), sol, temp, i);
        temp.remove(a.get(i));
        helper(a, b, sol, temp, i+1);
    }
}
