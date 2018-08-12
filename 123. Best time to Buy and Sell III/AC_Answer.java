class Solution {
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int sell1 = 0, sell2 = 0;
        for(int p:prices){
            sell2 = Math.max(sell2, hold2 + p); // if in the second transaction, we sell
            hold2 = Math.max(hold2, sell1 - p); // if after the first transaction, we buy the next stock
            sell1 = Math.max(sell1, hold1 + p);
            hold1 = Math.max(hold1, -p);
        }
        return sell2;
    }
}
