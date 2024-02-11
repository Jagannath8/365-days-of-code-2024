public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            String str = helper(A.get(i));
            if(map.get(str) != null) map.get(str).add(i+1);
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i+1);
                map.put(str,temp);
            }
        }
        
        for(ArrayList<Integer> e : map.values()) 
            ans.add(e);
        
        return ans;
    }
    
    public String helper(String str){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
