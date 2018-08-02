class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int area = 0;
        // use stack to record all non-descending subarray
        for(int i=0; i<=heights.length; i++){
            int h = (i==heights.length?0:heights[i]);
            if(s.isEmpty() || heights[s.peek()]<=h) s.push(i);
            else{
                int current_top = s.pop();
                
                area = Math.max(heights[current_top] * (s.isEmpty()? i: i-1-s.peek()), area);
                i--; // still start from current index in next loop
            }
        }
        return area;
    }
}
