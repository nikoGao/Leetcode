class Solution {
    private int row, col;
    public int numIslands(char[][] grid) {
        row = grid.length;
        int count=0;
        if(row==0) return 0;
        col = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    labelIsland(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }
    
    //Label all parts of current island, avoid next test
    public void labelIsland(char[][] grid, int i, int j){
        if(i<0 || j<0 ||i>=row|| j>=col || grid[i][j]=='0') return;
        grid[i][j] = '0';
        labelIsland(grid, i-1, j);
        labelIsland(grid, i+1, j);
        labelIsland(grid, i, j-1);
        labelIsland(grid, i, j+1);
    }
}
