class Solution {
    public int maximalRectangle(char[][] matrix) {
        /**
        Explanation: 
        To calculate an area, we need the start left, the end right and the height;
        The update only does when current element is '1'
        For a rectangle, the left boundary is the higher index between previous row and current row
        For a rectangle, the right boundary, see from right to left, is the minmum index between current row and previous one
        For a height, it's consecutive 1's in a col, so, if current element is 1, we can add to correspond col. However, once we meet a 0 in a col, the height will reset to 0, so that it'll not affect next rows.
        In the DP, before we update left, right, height, all data in them represent previous's row
        */
        int N = matrix.length;
        int area = 0;
        if(N==0) return area;
        int M = matrix[0].length;
        
        int[] left = new int[M], right = new int[M], height = new int[M];
        Arrays.fill(right, M);
        for(int i=0; i<N; i++){
            int cur_left = 0, cur_right = M;// the start/end index of a consecutive 1
            // calculate the area for each element
            for(int j=0; j<M; j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                    left[j] = Math.max(left[j], cur_left);
                }else{
                    height[j] = 0;
                    left[j] = 0;
                    cur_left = j+1; // the start index
                }
            }
            for(int j=M-1; j>=0; j--){
                if(matrix[i][j] == '1'){
                    right[j] = Math.min(right[j], cur_right);
                }else{
                    right[j] = M;
                    cur_right = j; // as start at M, already means the end
                }
            }
            // after collecting necessary data for a row, calculate the area with matrix[i][j] as bottom right corner
            for(int j=0; j<M; j++) area = Math.max(area, (right[j]-left[j])*height[j]);
        }
        return area;
    }
}
