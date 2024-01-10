public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if (A.length<2) 
            return 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<A.length; i++){
            List<Integer> list = new ArrayList<>();
            list.add(A[i]);
            list.add(i);
            ans.add(new ArrayList<>(list));
        }
        
        Collections.sort(ans,(x,y)->{
            return x.get(0)-y.get(0);
        });
        
        int min=ans.get(0).get(1);
        int res=0;
        for(int i=1; i<A.length; i++){
           min= Math.min(min,ans.get(i).get(1));
           res=Math.max(res,ans.get(i).get(1)-min);  
        }
        return res;
    }
}
