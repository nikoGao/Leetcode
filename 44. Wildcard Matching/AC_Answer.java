class Solution {
    public boolean isMatch(String s, String p) {
        // first, dp solution
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        int m = s.length(), n = p.length();
        dp[m][n] = true;
        for(int i=n-1; i>=0; i--){
            // in the case the last character of p is *, we need to label it as true first
            if(p.charAt(i)!='*') break;
            else dp[m][i] = true; 
        }
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(p.charAt(j)=='?' || p.charAt(j)==s.charAt(i)) dp[i][j] = dp[i+1][j+1];
                else if(p.charAt(j)=='*'){
                    // dp[i+1][j] if previous one equal, it represents more; dp[i][j+1] means it can represent zero
                    dp[i][j] = dp[i+1][j] || dp[i][j+1];
                }else dp[i][j] = false;
            }
        }
        return dp[0][0];
    }
}
