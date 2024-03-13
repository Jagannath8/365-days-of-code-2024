public class Solution {
    ArrayList<ArrayList<Integer>>rslt = new ArrayList();
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<Integer>path = new ArrayList();
        helper(path, A, 0, B);
        return rslt;
    }
    
    void helper(ArrayList<Integer>path,int N, int index, int count) {
        if(count == 0) {
            rslt.add(new ArrayList(path));
            return;
        }
        
        if(index >= N) {
            return;
        }
        path.add(index+1);
        helper(path, N, index+1, count-1);
        path.remove(path.size()-1);
        helper(path, N, index+1, count);
    }
}
