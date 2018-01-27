/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start < b.start?-1:a.start==b.start?0:1;
            }
        });
        List<Interval> result = new ArrayList<>();
        int start=-1, end = -1;
        for(Interval i:intervals){
            if((start==-1 && end==-1)){
                start = i.start;
                end = i.end;
            }else if(i.start>end){
                Interval new_Interval = new Interval(start, end);
                result.add(new_Interval);
                start = i.start;
                end = i.end;
            }else{
                end = Math.max(end, i.end);
            }
        }
        Interval new_Interval = new Interval(start, end);
        if(!result.contains(new_Interval) && intervals.size()>0) result.add(new_Interval);
        return result;
    }
}
