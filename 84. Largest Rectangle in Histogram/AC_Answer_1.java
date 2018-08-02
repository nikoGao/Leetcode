class Solution {
    public int largestRectangleArea(int[] heights) {
        // O(n^2) time
        int length = 0;
        int area = 0;
        for(int i=0; i<heights.length; i++){
            length = heights[i];
            area = Math.max(length, area);
            for(int j=i+1; j<heights.length; j++){
                length = Math.min(length, heights[j]);
                area = Math.max(area, length*(j-i+1));
            }
        }
        return area;
    }
}
