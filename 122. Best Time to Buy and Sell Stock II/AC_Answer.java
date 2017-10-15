// only need to consider positive differences, sum these up
// suppose the first sequence is "a <= b <= c <= d", the profit is "d - a = (b - a) + (c - b) + (d - c)" without a doubt. And suppose another one is "a <= b >= b' <= c <= d", the profit is not difficult to be figured out as "(b - a) + (d - b')". So you just target at monotone sequences


class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 0; i< prices.length-1; i++){
            if(prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }
        return total;
    }
}
