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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort((a,b) -> a.start-b.start);
        ArrayList<Interval> ans=new ArrayList<Interval>();
        Interval interval=intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval next=intervals.get(i);
            if(interval.start<=next.end && interval.end>=next.start){
                interval = new Interval(Math.min(interval.start, next.start), Math.max(interval.end, next.end));
            } 
            else {
                ans.add(interval);
                interval = next;
            }
        }
        ans.add(interval);
        return ans;
    }
}
