class Solution {
    public int maxProfit(int k, int[] prices) {
        // use 2-D array to represent on j'th day deal with transaction ith
        // instead of use [k][prices.length][2] array to represent sell and buy, use a variable to record the cost
        int n = prices.length;
        if(k>n/2) return quickCount(prices);
        int[][] profits = new int[k+1][n];
        for(int i=1; i<=k; i++){
            int temMax = -prices[0];
            for(int j=1; j<n; j++){
                // do transaction i+1 on day j, sell or not, as the first day can only buy, so inner loop start with 1
                profits[i][j] = Math.max(profits[i][j-1], prices[j]+temMax);
                // buy or not buy, basing on the cose
                temMax = Math.max(temMax, profits[i-1][j-1] - prices[j]);
            }
        }
        return profits[k][n-1];
    }
    
    public int quickCount(int[] prices){
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]) profit += prices[i]-prices[i-1];
        }
        return profit;
    }
}
