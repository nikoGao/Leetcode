class Solution {
    public int uniquePaths(int m, int n) {
        // calculate combination (n, k)
        // beacuse just choose (n-1) movements from (m+n-2)
        double res = 1;
        for (int i = 1; i <= n - 1; i++) {
            res *= ((double) (m + i - 1) / (double) i);
        }
        return (int)Math.round(res);
    }
    
}
