class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] powers = new int[dungeon.length][dungeon[0].length];
        int m = dungeon.length, n = dungeon[0].length;
        
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 && j==n-1){
                    if(dungeon[m-1][n-1]<=0) powers[m-1][n-1] = 1 - dungeon[m-1][n-1];
                    else powers[m-1][n-1] = 1;
                }else{
                    int right = (j+1<n?powers[i][j+1]:Integer.MAX_VALUE);
                    int down = (i+1<m?powers[i+1][j] : Integer.MAX_VALUE);
                    if(dungeon[i][j]>0){
                        int need = Math.min(right, down);
                        powers[i][j] = dungeon[i][j]>=need? 1: need - dungeon[i][j];
                    }else{
                        powers[i][j] = Math.min(right, down) - dungeon[i][j];
                    }
                }
            }
        }
        return powers[0][0];
    }
}
