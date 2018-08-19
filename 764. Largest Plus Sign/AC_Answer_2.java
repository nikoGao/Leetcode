class Solution {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] grid = new int[N][N];
        for(int[] g:grid) Arrays.fill(g, 1);
        for(int[] m:mines) grid[m[0]][m[1]] = 0;
        
        // find the mininal order in four directions
        int result = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(grid[i][j]==1){
                    int drs = 1;
                    while(i-drs>=0 && i+drs<N && j-drs>=0 && j+drs<N 
                          && grid[i-drs][j]==1 && grid[i+drs][j]==1
                         && grid[i][j-drs]==1 && grid[i][j+drs]==1){
                        drs++;
                    }
                    result = Math.max(result, drs);
                }
            }
        }
        
        return result;
    }
}
