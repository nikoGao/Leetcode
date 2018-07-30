class Solution{
	public int longestLine(int[][] matrix){
		int m = matrix.length;
		if(m==0) return 0;
		int n = matrix[0].length;
		int[][] dp = new int[m][n][4]; // 4 directions, horizontal, vertical, diagonal, anti-diagonal
		int max = 0;
		for(int i=0; i<; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j]==0) continue;
				for(int k=0; k<4; k++) dp[i][j][k] = 1; // all four directions set to 1
				if(j>0 && matrix[i][j-1]==1) dp[i][j][0] += dp[i][j-1][0]; // horizontal
				if(i>0 && matrix[i-1][j]==1) dp[i][j][1] += dp[i-1][j][1]; // vertical
				if(i>0 && j>0 && matrix[i-1][j-1]==1) dp[i][j][2] += dp[i-1][j-1][2]; // diagonal
				if(i>0 && j<n-1 && matrix[i-1][j+1]==1) dp[i][j][3] += dp[i-1][j+1][3]; // horizontal
				max = Math.max(max, Math.max(dp[i][j][0], dp[i][j][1]));
				max = Math.max(max, Math.max(dp[i][j][2], dp[i][j][3]));
			}
		}
		return max;
	}
}