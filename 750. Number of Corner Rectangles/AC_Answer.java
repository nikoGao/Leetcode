class Solution {
    public int countCornerRectangles(int[][] grid) {
        // O(n*(n-1)*m)
        if(grid.length<2) return 0;
        int result = 0;
        for(int i=0; i<grid.length;i++){
            for(int j=i+1; j<grid.length; j++){
                // fix two rows
                int line = 0;
                for(int k=0; k<grid[0].length; k++){
                    if((grid[i][k] & grid[j][k])==1) line++;
                }
                if(line>1) result += line * (line-1) /2;
            }
        }
        return result;
    }
}
