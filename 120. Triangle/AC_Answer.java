class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum  = 0;
        if(triangle.size()==0) return sum;
        int[] dp = new int[triangle.size()];
        Arrays.fill(dp, 0);
        for(int i=triangle.size()-1; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                if(i==triangle.size()-1) dp[j] += triangle.get(i).get(j);
                else{
                    dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
                }
            }
        }
        return dp[0];
    }
}
