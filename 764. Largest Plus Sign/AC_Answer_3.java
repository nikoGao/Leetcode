class Solution {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        // first, create a 2-d array filled with N because N is the largest but can not reach upper boundary of the order
        int[][] grid = new int[N][N];
        for(int[] g:grid) Arrays.fill(g, N);
        // second, change the value of coordinates in mines to 0, as 0 is the lower boundary of the order
        for(int[] m:mines) grid[m[0]][m[1]] = 0;
        // thirdly, start search for each direction with count
        int count = 0;
        for(int r=0; r<N; r++){
            // left
            count = 0;
            for(int c=0; c<N; c++){
                count = grid[r][c]==0? 0: count+1;
                grid[r][c] = Math.min(grid[r][c], count); // if current value is not 0, it's order should >=1
            }
            // right, reset count, find the min order between left & right
            count = 0;
            for(int c=N-1; c>=0; c--){
                count = grid[r][c]==0? 0 : count+1;
                grid[r][c] = Math.min(grid[r][c], count);
            }
        }
        for(int c=0; c<N; c++){
            // down
            count = 0;
            for(int r=0; r<N; r++){
                count = grid[r][c]==0? 0 : count+1;
                grid[r][c] = Math.min(grid[r][c], count);
            }
            // up
            count = 0;
            for(int r=N-1; r>=0; r--){
                count = grid[r][c]==0? 0 : count+1;
                grid[r][c] = Math.min(grid[r][c], count);
            }
        }
        // Finally, find the max among each order
        int result = 0;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++) result = Math.max(result, grid[r][c]);
        }
        return result;
    }
}
