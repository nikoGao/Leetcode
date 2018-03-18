class Solution {
    public int maxProfit(int[] prices) {
        int prev_buy = 0, buy = Integer.MIN_VALUE, prev_sell=0, sell=0;
        for(int price:prices){
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
}
