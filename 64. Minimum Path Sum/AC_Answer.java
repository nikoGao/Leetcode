class Solution {
    public int minPathSum(int[][] grid) {
        int[][] sums = new int[grid.length][grid[0].length];
        sums[0][0] = grid[0][0];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(i==0 && j>0) sums[i][j] = grid[i][j] + sums[i][j-1];
                else if(j==0 && i>0) sums[i][j] = grid[i][j] + sums[i-1][j];
                else if(i>0 && j>0) sums[i][j] = grid[i][j] + Math.min(sums[i-1][j], sums[i][j-1]);
            }
        }
        return sums[grid.length-1][grid[0].length-1];
    }
}
