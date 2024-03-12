public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = A.size();
        int x = (int)Math.pow(2,n);
        for(int i=0;i< x; i++)
        {
            ArrayList<Integer> intlist = new ArrayList<>();
             for(int j=0;j<=31; j++)
            {
                if(((1<<j)& i)!=0)
                {
                    intlist.add(A.get(j));
                   
                }
            }
            Collections.sort(intlist);
            list.add(intlist);
        }
        Collections.sort(list, new Comparator<List<Integer>>() {
    @Override
    public int compare(List<Integer> first, List<Integer> second) {
        int comp = 0;
        for(int i = 0; i < Math.min(first.size(), second.size()); i++){
            comp = Integer.compare(first.get(i), second.get(i));
            if(comp != 0){
                return comp;
            }
         }
         return Integer.compare(first.size(), second.size());
    }
});
        return list;
    }
}
