public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int a:A){
            if(!mp.containsKey(a))
                mp.put(a,1);
            else
                return a;
        }
        return -1;
    }
}
