class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        if(m<3) return 0;
        int n = grid[0].length;
        if(n<3) return 0;
        int count = 0;
        for(int i=0; i<m-2; i++){
            for(int j=0; j<n-2;j++){
                if(checkMagic(i,j, grid)) count++;
            }
        }
        return count;
    }
    
    public boolean checkMagic(int row, int col, int[][] grid){
        for(int i= row; i<row+3; i++){
            for(int j= col; j<col+3; j++){
                if(grid[i][j]<1 || grid[i][j]>9) return false;
            }
        }
        int row1 = grid[row][col] + grid[row][col+1] + grid[row][col+2];
        int row2 = grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2];
        int row3 = grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2];
        int col1 = grid[row][col] + grid[row+1][col] + grid[row+2][col];
        int col2 = grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1];
        int col3 = grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2];
        int diagnol1 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
        int diagnol2 = grid[row+2][col] + grid[row+1][col+1] + grid[row][col+2];
        if((row1+row2+row3)==45 && (row1==row2) &&(row2==row3) && (row3==col1) && (col1==col2) && (col2==col3) && (col3==diagnol1) && (diagnol1==diagnol2)) return true;
        else return false;
    }
}
