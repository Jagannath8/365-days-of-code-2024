public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int k) {
        ArrayList<Integer> list =new ArrayList<>();
        Deque<Integer> q= new LinkedList<>();
        int i=0;
        int j=0;
        while(j<A.size()){
            if(q.size()>0){       
                while(q.size()>0 && q.getLast()<A.get(j)){
                    q.removeLast();
                }
                q.addLast(A.get(j));                   
            }
            else
                q.addFirst(A.get(j));
            if(j-i+1<k)
                j++;   
            else if(j-i+1==k){
                list.add(q.getFirst());
                if(A.get(i)==q.getFirst()){
                    q.removeFirst();
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
