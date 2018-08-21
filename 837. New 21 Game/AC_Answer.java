class Solution {
    public double new21Game(int N, int K, int W) {
        if(K==0 || N>=K+W) return 1.0;
        double[] dp = new double[N+1]; // the length is the largest number we can reach, out of this range is not possible
        // what we want is the probability between K~N
        // dp[i] is the probability of get i points
        // dp[i] = sum(last W dp values) / W as i can be through i-W + (a point getting from W)
        double Wsum = 1.0, res = 0.0;
        dp[0] = 1;
        for(int i=1; i<=N; i++){
            dp[i] = Wsum/W;
            if(i<K) Wsum += dp[i];
            else res += dp[i];
            if(i>=W) Wsum -= dp[i-W]; // remove element from the W-length window
        }
        return res;
    }
}
