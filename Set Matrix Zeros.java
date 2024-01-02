public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j)==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(Integer r:row){
            for(int j=0;j<a.get(r).size();j++)
                a.get(r).set(j,0);
        }
        
        for(int i=0;i<a.size();i++){
            for(Integer c:col)
                a.get(i).set(c,0);
        }
	}
}
