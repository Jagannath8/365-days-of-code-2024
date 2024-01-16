/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(newInterval==null)
            return intervals;
        
        ArrayList<Interval> merge=new ArrayList<>();
        merge.add(newInterval);
        for(int i=0;i<intervals.size();i++){
            Interval inter=merge.remove(merge.size()-1);
            Interval curr=intervals.get(i);
            if(inter.start>curr.end){
                merge.add(curr);
                merge.add(inter);
            }
            else if(inter.end<curr.start){
                merge.add(inter);
                merge.add(curr);
            }
            else{
                int start=Math.min(inter.start, curr.start);
                int end=Math.max(inter.end, curr.end);
                merge.add(new Interval(start,end));
            }
        }
        return merge;
    }
}
