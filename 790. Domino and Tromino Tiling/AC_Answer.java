class Solution {
    public int numTilings(int N) {
        /** N=1, only one tile: |
        N=2, two tiles: || or it's rotation
        N=3, basing on N=1, add N=2, or basing on N=2, add N=1, or use 2 L tile, construct a new one(notice it's rotation represents a new tile)
        N=4, basing on N=3, add N=1; basing on N=2, add N=2(the two switch are same); basing on N=1, add N=3 constructed with Ls, basing on N=0, construct with L and --, it's a new tile
        ....
        so for dp[N] = dp[N-1] + dp[N-2] + 2*(dp[N-3]+...+dp[0]) = dp[N-1] + dp[N-3] + dp[N-2] + dp[N-3] + 2*(dp[N-4]+dp[0])
                     = dp[N-1] + dp[N-3] +dp[N-1]
        */
        int module = (int)1e9 + 7;
        int[] dp = new int[1000+1];
        if(N==0) return 0;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        if(N<=2) return dp[N];
        for(int i=3; i<=N; i++){
            dp[i] = 2 * dp[i-1] % module + dp[i-3] % module;
            dp[i] %= module;
        }
        return dp[N];
    }
}
