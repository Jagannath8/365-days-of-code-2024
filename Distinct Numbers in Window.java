public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(B>A.size()){
            return arr;
        }
        int j=0;
        for(int i=0; i<A.size(); i++){
            if(i<B){
                if(map.containsKey(A.get(i))){
                    int num = map.get(A.get(i))+1;
                    map.put(A.get(i),num);
                }else{
                    map.put(A.get(i),1);
                }
               
            }else{
                arr.add(map.size());
                if(map.get(A.get(j))>1){
                    int num2 = map.get(A.get(j))-1;
                    map.put(A.get(j),num2);
                    if(map.containsKey(A.get(i))){
                        int num = map.get(A.get(i))+1;
                        map.put(A.get(i),num);
                    }else{
                        map.put(A.get(i),1);
                    }
                    j++;
                }else{
                    map.remove(A.get(j));
                    if(map.containsKey(A.get(i))){
                        int num = map.get(A.get(i))+1;
                        map.put(A.get(i),num);
                    }else{
                        map.put(A.get(i),1);
                    }
                    j++;
                }
            }
           
        }
        arr.add(map.size());
        return arr;
    }
}
