/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
class Solution {
    public int maxPoints(Point[] points) {
        // a line y=kx + b, each two points can determine a line
        // the question is to find the most frequency appearance of k and b
        // as y1 = k*x1 + b, y2 = k*x2 + b...., then (y2-y1)/(x2-x1) = (y3-y1)/(x3-x1)...
        // so we need to find the GCD between (y2-y1)&(x2-x1), after divide by k, we can get the minimal number of these points
        Map<String, Integer> minimal = new HashMap<>();
        int result = 0;
        if(points.length==0) return 0;
        if(points.length<2) return points.length;
        for(int i=0; i<points.length; i++){
            minimal.clear();
            int overlap = 0;
            int max = 0;
            for(int j=i+1; j<points.length; j++){
                int x0 = points[j].x-points[i].x;
                int y0 = points[j].y-points[i].y;
                // verify the overlap
                if(x0==0 && y0==0){
                    overlap++;
                    continue;
                }
                int gcd = findGCD(x0, y0);
                if(gcd!=0){
                    x0 /= gcd;
                    y0 /= gcd;
                }
                String concat = x0 + "&" + y0;
                minimal.put(concat, minimal.getOrDefault(concat, 0)+1);
                max = Math.max(max, minimal.get(concat));
            }
            result = Math.max(result, max + overlap + 1); // don't forget current point itself
        }
        return result;
    }
    
    public int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b, a%b); // always keep a>b
    }
}
