class Solution {
    // the basic equation is T[i][k][0] = max(T[i-1][k][0], T[i-1][k][1]+price) as sell the stock
    // T[i][k][1] = max(T[i-1][k][1], T[i-1][k][0]-prices-fee)
    // in this case, infinitely k, so k & k-1 doesn't matters
    public int maxProfit(int[] prices, int fee) {
        int Ti0 = 0, Ti1 = Integer.MIN_VALUE;
        for(int p:prices){
            int temp = Ti0; // for the use in Ti1
            Ti0 = Math.max(Ti0, Ti1 + p);
            Ti1 = Math.max(Ti1, temp - p - fee);
        }
        // at last there should be no stock in our hand
        return Ti0;
    }
}
