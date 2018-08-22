class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length()+1][s.length()+1];
        Arrays.fill(dp[0], 1);
        
        // traversal ith index of t, jth index of s
        for(int i=0; i<t.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==t.charAt(i)){
                    // if current character equals, then there are total dp[i][j](not including current char) + dp[i+1][j](number of current chars) distinct substring
                    dp[i+1][j+1] = dp[i][j] + dp[i+1][j];
                }else dp[i+1][j+1] = dp[i+1][j];
            }
        }
        return dp[t.length()][s.length()];
    }
}
