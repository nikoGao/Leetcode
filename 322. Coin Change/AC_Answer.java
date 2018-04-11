class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        return coinCount(coins, amount, new int[amount]);
    }
    
    public int coinCount(int[] coins, int amount, int[] rem){
        if(amount==0) return 0;
        if(amount<0) return -1;
        if(rem[amount-1]!=0) return rem[amount-1]; //current data has value
        int min = Integer.MAX_VALUE;
        for(int coin:coins){
            int res = coinCount(coins, amount-coin, rem);
            if(res>=0 && res<min){
                min = res+1;
            }
        }
        rem[amount-1] = (min==Integer.MAX_VALUE)? -1:min;
        return rem[amount-1];
    }
}
