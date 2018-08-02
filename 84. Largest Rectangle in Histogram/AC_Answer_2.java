class Solution {
    public int largestRectangleArea(int[] heights) {
        /** 
        improve O(nlogn) time
        each time, find the minimum value in current [start, end]
        then there could only three possible result:
        1. all values on left of the minimum(without minimum value)
        2. all values on the right of the minimum(wihtout itself)
        3. minimum * (end-start)
        It's like building a BST, dividing and conquer
        **/
        int result = divide(heights, 0, heights.length);
        return result;
    }
    
    public int divide(int[] heights, int start, int end){
        if(end<=start){
            return 0;
        }
        int minimum = start;
        for(int i=start+1;i<end; i++){
            if(heights[i]<heights[minimum]) minimum = i;
        }
        // System.out.println(minimum);
        int area = Math.max(heights[minimum]*(end-start), 
                            Math.max(divide(heights, start, minimum), divide(heights, minimum+1, end)));
        return area;
    }
}
