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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int i=0;
        List<Interval> result = new ArrayList<>();
        // first add all intervals smaller than the new one
        while(i<intervals.size() && intervals.get(i).end<newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        // merge all overlap intervals
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end){
            newInterval = new Interval(Math.min(intervals.get(i).start, newInterval.start), 
                                       Math.max(intervals.get(i).end, newInterval.end));
            i++;
        }
        result.add(newInterval);
        // add all intervals bigger than new ones
        while(i<intervals.size() && intervals.get(i).start>newInterval.end){
            result.add(intervals.get(i));
            i++;
        }
        return result;
    }
}