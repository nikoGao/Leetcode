class NumMatrix {
    // current solution update O(n*m)
    
    int[][] nums;
    int[][] dp;
    int N = 0, M = 0;

    public NumMatrix(int[][] matrix) {
        N = matrix.length;
        if(N!=0) M = matrix[0].length;
        nums = new int[N][M];
        dp = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                nums[i][j] = matrix[i][j];
                dp[i][j] += matrix[i][j];
                if(i>0) dp[i][j] += dp[i-1][j];
                if(j>0) dp[i][j] += dp[i][j-1];
                if(i>0 && j>0) dp[i][j] -= dp[i-1][j-1]; 
            }
        }
    }
    
    public void update(int row, int col, int val) {
        int diff = nums[row][col] - val;
        nums[row][col] = val;
        for(int i=row; i<N; i++){
            for(int j=col; j<M; j++) dp[i][j] -= diff;
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(N==0 || M==0) return 0;
        int square = dp[row2][col2];
        if(row1>0) square -= dp[row1-1][col2];
        if(col1>0) square -= dp[row2][col1-1];
        if(row1>0 && col1>0) square += dp[row1-1][col1-1];
        return square;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
