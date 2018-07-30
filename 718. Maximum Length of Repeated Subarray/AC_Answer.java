class Solution {
    public int findLength(int[] A, int[] B) {
        // the question is pointed to continuous subarray
        if(A.length==0 || B.length==0) return 0;
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m+1][n+1];
        int result = 0;
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0||j==0) dp[i][j] = 0;
                else{
                    if(A[i-1]==B[j-1]){
                        dp[i][j] = dp[i-1][j-1] + 1;
                        result = Math.max(result, dp[i][j]);
                    }
                }
            }
        }
        return result;
    }
}
