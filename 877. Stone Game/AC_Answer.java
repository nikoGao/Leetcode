class Solution {
    public boolean stoneGame(int[] piles) {
        int N = piles.length;
        int[][] dp = new int[N][N];
        // dp[i][j] means the biggest number of stones we can get between i~j index
        for(int i=0; i<N; i++) dp[i][i] = piles[i];
        // so if choose p[i], then the difference should be p[i] - dp[i+1][i+d](p[i] represent what Alex choose, dp[i+1][i+d] represent the biggest number Alex can choose)
        for(int d=1; d<N; d++){
            for(int i=0; i<N-d; i++){
                dp[i][i+d] = Math.max(piles[i]-dp[i+1][i+d], piles[i+d]-dp[i][i+d-1]);
            }
        }
        return dp[0][N-1]>0;
    }
}
